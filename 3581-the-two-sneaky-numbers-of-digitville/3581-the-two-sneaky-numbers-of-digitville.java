class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
  ArrayList<Integer> ans  = new ArrayList<>();
        for(int i=1;i<n;i++){
if(nums[i] == nums[i-1]) {
  ans.add(nums[i]);
} }
         int[] res = new int[ans.size()];
        for(int i=0;i<ans.size();i++){
         res[i] = ans.get(i);
        }
        return res;
    }
}