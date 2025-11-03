class Solution {
    public int minCost(String colors, int[] neededTime) {
        int sum =0; 
        int n = colors.length();

for(int i=1;i<n;i++){
    if(colors.charAt(i) == colors.charAt(i-1)){
        sum += Math.min(neededTime[i],neededTime[i-1]); // remove the min in time
        // keep the max wala by adding in arr
        neededTime[i] = Math.max(neededTime[i],neededTime[i-1]);
    }
}
return sum;
}
    }
