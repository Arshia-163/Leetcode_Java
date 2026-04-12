class Solution {
    public int firstUniqChar(String s) {
        
        for(int i=0;i<s.length();i++){
            char curr= s.charAt(i);
            boolean check =true;

            for(int j=0;j<s.length();j++){
                if(i !=j && s.charAt(j) == curr){
                    check =false;
                    break;
                }
            }
            if(check){
                return i;
            }
        }
        return -1;
    }
}