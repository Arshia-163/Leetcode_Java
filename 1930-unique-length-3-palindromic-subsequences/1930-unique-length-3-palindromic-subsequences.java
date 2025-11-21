class Solution {
    public int countPalindromicSubsequence(String s) {
        Set<Character> ch = new HashSet();
  int ans=0;
        for(Character c:s.toCharArray()){
            ch.add(c);
        }

for(Character l:ch){
    int i=-1;
    int j=0;
for(int k=0;k<s.length();k++){
        if(s.charAt(k) == l){
            if(i ==-1){
                i =k;
            }
            j= k;
        }
    }
    Set<Character> bt = new HashSet();
    for(int k=i+1;k<j;k++){
        bt.add(s.charAt(k));
    }
    ans +=bt.size();
}
return ans;

    }
}