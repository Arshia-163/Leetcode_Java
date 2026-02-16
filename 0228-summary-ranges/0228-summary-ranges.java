class Solution {
    public List<String> summaryRanges(int[] nums) {
        int n = nums.length;
ArrayList<String> res = new ArrayList<>();
if(n == 0){
    return res;
}

int start= nums[0];

        for(int i=1;i<n;i++){
            if(nums[i] != nums[i-1]+1){
                if(start == nums[i-1]){
                  res.add(String.valueOf(start));  
                }
                else{
                    res.add(start+"->"+nums[i-1]);
                }
                start = nums[i];
            }
        }

        if(start == nums[n-1]){
            res.add(String.valueOf(start));
        }
else {
    res.add(start + "->" + nums[n - 1]);
}
        return res;
    }
}