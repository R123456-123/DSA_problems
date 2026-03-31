class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

       Map<String,List<String>> map = new HashMap<>();

       for(String str : strs) {
        char[] s = str.toCharArray();
        Arrays.sort(s);
        String key = new String(s);

        map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
       }
       return new ArrayList<>(map.values());
    }
}
