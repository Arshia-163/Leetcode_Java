class Solution {
    public int longestSubsequence(String s, int k) {
         int len = s.length();
        int count = 0; // To count valid bits in the subsequence
        int zeros = 0;

        // Step 1: Count all '0's as they contribute nothing to value
        for (char c : s.toCharArray()) {
            if (c == '0') zeros++;
        }

        // Step 2: Greedily add '1's from the right side
        long value = 0;
        int power = 0;
        for (int i = len - 1; i >= 0; i--) {
            if (s.charAt(i) == '1') {
                // Add 2^power only if it keeps value <= k
                if (power < 32 && value + (1L << power) <= k) {
                    value += (1L << power);
                    count++;
                }
            } else {
                count++; // we already counted '0' earlier
            }
            power++;
        }

        return count;
    }
}