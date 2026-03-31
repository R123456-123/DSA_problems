class Solution {
    public String minWindow(String s, String t) {
        if(s.length() < t.length() || t.isEmpty()) return "";

        Map<Character,Integer> mapT = new HashMap<>();
        for(char c : t.toCharArray()) {
           mapT.put(c, mapT.getOrDefault(c,0) + 1);
        }

        Map<Character,Integer> window = new HashMap<>();

        int have = 0, need = mapT.size();
        int left = 0, resLen = Integer.MAX_VALUE;
        int[] res = {-1,-1};

        for(int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            window.put(c, window.getOrDefault(c,0) + 1);

            if(mapT.containsKey(c) && window.get(c).equals(mapT.get(c))) {
                have++;
            }

            while(have == need) {
                if(right - left + 1 < resLen) {
                    resLen = right - left + 1;
                    res[0] = left;
                    res[1] = right;
                } 

                char leftChar = s.charAt(left);
                window.put(leftChar, window.get(leftChar) - 1);
                if(mapT.containsKey(leftChar) && window.get(leftChar) < mapT.get(leftChar)) {
                    have--;
                }
                left++;
            }
        }

        return resLen == Integer.MAX_VALUE ? "" : s.substring(res[0], res[1] + 1);
    }
}
