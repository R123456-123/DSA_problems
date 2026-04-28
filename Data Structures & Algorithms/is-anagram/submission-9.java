class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        Map<Character, Integer> freq = new HashMap<>();

        for(char c : t.toCharArray()) {
            freq.put(c, freq.getOrDefault(c,0) + 1);
        } 

        for(char c : s.toCharArray()) {
            if(freq.containsKey(c)) {
                freq.put(c, freq.get(c) - 1);

                if(freq.get(c) == 0) {
                    freq.remove(c);
                }
            }
        }

        return freq.isEmpty();
    }
}
