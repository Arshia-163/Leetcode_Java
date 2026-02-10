class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashMap<Character,Integer> map = new HashMap<>();
        int left=0;
        int len=0;
        for(int r=0;r<s.length();r++){
            char ch = s.charAt(r);

            // agr dupl. mila toh window ek agge move
            if(map.containsKey(ch)){
                left = Math.max(left,map.get(ch)+1);
            }
    map.put(ch,r); // last idx update
    len = Math.max(len,r-left+1);
        }
        return len;
    }
}