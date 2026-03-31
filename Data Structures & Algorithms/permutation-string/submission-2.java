class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false; //edge case means when the length of small string will longer then large string.
      
        int[] s1Freq = new int[26];
        int[] s2Freq = new int[26];

        for(int i = 0; i < s1.length(); i++) {
            s1Freq[s1.charAt(i) - 'a']++;
            s2Freq[s2.charAt(i) - 'a']++;
        }
 
        int matches = 0;
        for(int i = 0; i < 26; i++) {
           if(s1Freq[i] == s2Freq[i]) {
            matches++;
           }
        }

        int l = 0;
        for(int r = s1.length(); r < s2.length(); r++) {
           if(matches == 26) {
            return true;
           }

           int idx = s2.charAt(r) - 'a';
           s2Freq[idx]++;
           if(s1Freq[idx] == s2Freq[idx]) {
            matches++;
           } else if(s1Freq[idx] + 1 == s2Freq[idx]){
             matches--;
           }

           idx = s2.charAt(l) - 'a';
           s2Freq[idx]--;
           if(s1Freq[idx] == s2Freq[idx]) {
            matches++;
           } else if(s1Freq[idx] - 1 == s2Freq[idx]) {
            matches--;
           }

           l++;
        }
        return matches == 26;
    }
}
