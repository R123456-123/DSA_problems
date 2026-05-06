class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;
        if(s.length() == 1) return 1;

        int res = 0;
        Set<Character> set = new HashSet<>();

        int left = 0, right = 0;
        while(right < s.length()) {
           while(left < right && set.contains(s.charAt(right))) {
              set.remove(s.charAt(left));
              left++;
           }
           set.add(s.charAt(right));

           res = Math.max(res, right - left + 1);

           right++;
        }

        return res;
    }
}
