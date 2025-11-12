class Solution {
    public int minOperations(int[] nums) {
int n = nums.length;
int ans = nums[0];
        for(int i=1;i<n;i++){
ans = gcd(ans,nums[i]);}

if(ans >1) return -1; // not possible

// check krega no. of 1 in arr
int count=0;
for(int i:nums){
    if(i == 1) count++;}
    if(count>0){
        return n-count; 
}
// Step 3: Find smallest subarray with gcd = 1
int minLen = Integer.MAX_VALUE;
for(int i=0;i<n;i++){
    int curr = nums[i];
    for(int j=i+1;j<n;j++){
        curr = gcd(curr,nums[j]);
        if (curr == 1) {
     minLen = Math.min(minLen, j - i + 1);
     break; // no need to go further
    }
}}
 return (minLen - 1) + (n - 1);   
 }   static int gcd(int i,int j){
        if(j == 0){
            return i;
        }
        return gcd(j,i%j);
    }
}