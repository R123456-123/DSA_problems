class Solution {
    public String mergeAlternately(String word1, String word2) {
       StringBuilder res = new StringBuilder();

       if(word1 == null && word2 == null) return "";

       if(word1.length() == 0 && word2.length() == 0) return "";

       int i = 0, j = 0;
       int w1 = word1.length(), w2 = word2.length();

       while(i < w1 && j < w2) {
          res.append(word1.charAt(i));
          res.append(word2.charAt(j));
          i++;
          j++;
       }

       while(i < w1) {
        res.append(word1.charAt(i));
        i++;
       } 

       while(j < w2) {
        res.append(word2.charAt(j));
        j++;
       }

       return res.toString();
    }
}