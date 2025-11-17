class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int prev =-1;

        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1){
            if(prev != -1 && i-prev-1<k){// check the dist b/w '1'
            return false;}
            prev = i; // update idx for 1
            }
        }
        return true;
    }
}