class Solution {
    public String longestCommonPrefix(String[] strs) {
        int i;
       for(i = 0; i < strs[0].length(); i++) {
        for(String s : strs) {
            if(i == s.length() || s.charAt(i) != strs[0].charAt(i)) {
                return s.substring(0,i);
            }
        }
       } 
       return strs[0].substring(0,i); 
    }
}