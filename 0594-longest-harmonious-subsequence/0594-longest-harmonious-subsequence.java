class Solution {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
// hr num ke check kro use bda ya chota num present hai 
// agr num hai toh num+1 hai ya nhi; hai toh inki sari freq ko add kro len me;

int maxlen= 0;
for(int key:map.keySet()){
   if(map.containsKey(key+1)){
    int len = map.get(key)+map.get(key+1);
    maxlen = Math.max(maxlen,len);
}}
return maxlen;
    }
}