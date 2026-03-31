class Solution {
    public boolean isAnagram(String s, String t) {
      
      if(s == null && t == null) return true;
      if(s == null || t == null) return false;
      if(s.length() != t.length()) return false;


      Map<Character,Integer> mapS = new HashMap<>();
      for(char c : s.toCharArray()) {
        mapS.put(c, mapS.getOrDefault(c,0) + 1);
      }


      for(char c : t.toCharArray()) {

        if(!mapS.containsKey(c)) {
           return false;
        }

        mapS.put(c, mapS.get(c) - 1);
        if(mapS.get(c) == 0) {
            mapS.remove(c);
        }

      }

      return mapS.isEmpty();
    } 
}


