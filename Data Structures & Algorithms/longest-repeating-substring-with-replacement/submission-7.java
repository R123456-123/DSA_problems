class Solution {
    public int characterReplacement(String s, int k) {
       if(s == null && s.length() == 0) return 0;

       int[] freq = new int[26];
       
       int left = 0, maxF = 0, res = 0;

       for(int right = 0; right < s.length(); right++) {
          char c = s.charAt(right);
          freq[c - 'A']++;

          maxF = Math.max(maxF, freq[c - 'A']);
          
          while((right - left + 1) - maxF > k) {
            char charLeft = s.charAt(left);
            freq[charLeft - 'A']--;
            left++;
          }

          res = Math.max(res, right - left + 1);
       }

       return res;
    }
}
