class Solution {

    public String encode(List<String> strs) {
       StringBuilder str = new StringBuilder();

       for(String s : strs) {
           str.append(s.length()).append('#').append(s);
       }

       return str.toString(); 
    }

    public List<String> decode(String str) {
       List<String> res = new ArrayList<>();
       int left = 0, right = 0;

       while(right < str.length()) {
         while(str.charAt(right) != '#') {
            right++;
         }

         int len = Integer.parseInt(str.substring(left, right));
         right++;
         left = right;
         right = left + len;

         res.add(str.substring(left,right));

         left = right;
       }

       return res;
    }
}
