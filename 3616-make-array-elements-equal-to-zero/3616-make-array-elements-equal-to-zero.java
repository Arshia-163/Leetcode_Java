class Solution {
    public int countValidSelections(int[] nums) {
        int leftSum =0,rightSum =0;
     int ans=0;

     for(int i:nums) rightSum +=i;
        for(int i=0;i<nums.length;i++){
               leftSum +=nums[i];
               rightSum -=nums[i];
                
            if(nums[i] != 0)  continue;
            if(leftSum == rightSum){
                ans += 2;  // dono left & rght valid hai
            }      
            if(Math.abs(leftSum-rightSum) == 1){
                ans++;  // check only in one left ya right
            }
        }
        return ans;
    }
}