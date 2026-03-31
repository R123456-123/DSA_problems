class Solution {
    public boolean checkInclusion(String s1, String s2) {
       char[] str1 = s1.toCharArray();
       Arrays.sort(str1);
       String sorStr1 = new String(str1);

       for(int i = 0; i < s2.length(); i++) {
        for(int j = i; j < s2.length(); j++) {
           char[] s = s2.substring(i,j + 1).toCharArray();
           Arrays.sort(s);
           String sorS = new String(s);

           if(sorS.equals(sorStr1)) {
            return true;
           }
        }
       }
       return false;
    }
}
