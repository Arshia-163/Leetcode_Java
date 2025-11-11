class Solution {
    public int largestAltitude(int[] gain) {
        int curr= 0;
        int high = curr;

        for(int i:gain){
            curr += i;
            high = Math.max(high,curr);
        }
        return high;
    }
}