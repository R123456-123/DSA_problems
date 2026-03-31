class Solution {
    public boolean isAnagram(String s, String t) {
      if(s.length() != t.length()) return false;

      int[] res = new int[26]; // {0,...}

      for(char c : s.toCharArray()) {
        res[c - 'a']++;
      }

      for(char c : t.toCharArray()) {
        res[c - 'a']--;
      }

      for(int val : res) {
        if(val != 0){
          return false;
        }
      }

      return true;
    }
}
