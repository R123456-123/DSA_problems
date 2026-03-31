class Solution {
    public String minWindow(String s, String t) {
       if(t.isEmpty()) return "";

       Map<Character,Integer> mapT = new HashMap<>();
       for(char c : t.toCharArray()) {
        mapT.put(c, mapT.getOrDefault(c,0) + 1);
       } 

       int resLen = Integer.MAX_VALUE;
       int[] res = {-1,-1};

       for(int i = 0; i < s.length() - t.length() + 1; i++) {
        Map<Character,Integer> mapS = new HashMap<>();
        for(int j = i; j < s.length(); j++) {
            mapS.put(s.charAt(j), mapS.getOrDefault(s.charAt(j), 0) + 1);

            boolean flag = true;
            for(char c : mapT.keySet()) {
                if(mapS.getOrDefault(c,0) < mapT.get(c)) {
                    flag = false;
                    break;
                }
            }

            if(flag && j - i + 1 < resLen) {
                resLen = j - i + 1;
                res[0] = i;
                res[1] = j;
            }
        }
       }

       return resLen == Integer.MAX_VALUE ? "" : s.substring(res[0], res[1] + 1);
    }
}
