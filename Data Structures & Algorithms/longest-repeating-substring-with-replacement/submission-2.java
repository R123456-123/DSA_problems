class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character,Integer> map = new HashMap<>();
        int res = 0, left = 0, maxf = 0;

        for(int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0) + 1);
            maxf = Math.max(maxf, map.get(s.charAt(i)));
 
            while((i - left + 1) - maxf > k) {
                map.put(s.charAt(left), map.get(s.charAt(left)) - 1);
                left++;
            }

            res = Math.max(res, i - left + 1);
        }
        return res;
    }
}
