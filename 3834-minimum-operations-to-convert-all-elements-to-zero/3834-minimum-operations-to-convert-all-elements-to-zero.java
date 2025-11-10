class Solution {
    public int minOperations(int[] nums) {

List<Integer> ans = new ArrayList<>();
int count=0;

for(int n:nums){
    while(!ans.isEmpty() && ans.get(ans.size()-1)>n){
ans.remove(ans.size()-1);
}
if (n ==0) continue;
if (ans.isEmpty() || ans.get(ans.size()-1)<n){
    count++;
    ans.add(n);
}
    }
return count;
    }
}