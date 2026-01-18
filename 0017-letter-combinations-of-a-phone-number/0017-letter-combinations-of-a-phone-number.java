class Solution {
    public List<String> letterCombinations(String digits) {
       ArrayList<String> res = new ArrayList<>();
       if(digits == null||digits.length() ==0)
       return res;
       String[] map ={
        "",
        "",
        "abc",
        "def",
        "ghi",
        "jkl",
        "mno",
        "pqrs",
        "tuv",
        "wxyz",
       };
       backtrack(0,digits,new StringBuilder(),res,map);   
       return res;   
    }

    static void backtrack(int idx,String digits,StringBuilder curr,ArrayList<String> res,String[] map){
        if(idx == digits.length()){
            res.add(curr.toString());
            return;
        }
       char ch = digits.charAt(idx);
         String letters = map[ch - '0'];
         for(int i=0;i<letters.length();i++){
            curr.append(letters.charAt(i));
            backtrack(idx+1,digits,curr,res,map);
            curr.deleteCharAt(curr.length()-1);
         }
    }
}