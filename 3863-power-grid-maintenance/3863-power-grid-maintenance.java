class Solution {
    public int[] processQueries(int c, int[][] connections, int[][] queries) {
        List<List<Integer>> graph = new ArrayList<>();
 for (int i = 0; i <= c; i++) graph.add(new ArrayList<>());
        for (int[] con : connections) {
            graph.get(con[0]).add(con[1]);
            graph.get(con[1]).add(con[0]);
        }

        //  Find connected components using DFS
int[] gridId = new int[c + 1];  // gridId[i] = grid number
        boolean[] visited = new boolean[c + 1];
        int gridCount = 0;

        for (int i = 1; i <= c; i++) {
            if (!visited[i]) {
                gridCount++;
                dfs(i, graph, visited, gridId, gridCount);
            }
        }

// For each grid, maintain TreeSet of online stations
        Map<Integer, TreeSet<Integer>> gridOnline = new HashMap<>();
        for (int i = 1; i <= c; i++) {
            gridOnline.putIfAbsent(gridId[i], new TreeSet<>());
            gridOnline.get(gridId[i]).add(i);
        }

 boolean[] online = new boolean[c + 1];
        Arrays.fill(online, true);

        List<Integer> results = new ArrayList<>();

        // Step 4: Process queries
        for (int[] q : queries) {
            int type = q[0];
            int x = q[1];
            int g = gridId[x];

            if (type == 1) {
                if (online[x]) {
                    results.add(x);
                } else {
                    TreeSet<Integer> set = gridOnline.get(g);
                    if (set.isEmpty()) results.add(-1);
                    else results.add(set.first());
                }
            } else if (type == 2) {
                if (online[x]) {
                    online[x] = false;
                    gridOnline.get(g).remove(x);
                }
            }
        }

        // Convert List<Integer> to int[]
        int[] ans = new int[results.size()];
        for (int i = 0; i < results.size(); i++) ans[i] = results.get(i);
        return ans;
    }

    private void dfs(int node, List<List<Integer>> graph, boolean[] visited, int[] gridId, int id) {
        visited[node] = true;
        gridId[node] = id;
        for (int nei : graph.get(node)) {
            if (!visited[nei]) dfs(nei, graph, visited, gridId, id);
        }
    }


    
}