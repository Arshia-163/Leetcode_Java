class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left =0;
        int sum=0;
        int len = Integer.MAX_VALUE;

        for(int r=0;r<nums.length;r++){
            sum += nums[r];

            while(sum >= target){
                len = Math.min(len,r-left+1);
                sum -= nums[left];
                left++;
            }
        }

if(len == Integer.MAX_VALUE){
    return 0;
}
else
return len;
    }
}