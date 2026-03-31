class Solution {
    public boolean isPalindrome(String s) {
       int i = 0;
       int j = s.length() - 1;

       while(i <= j) {

        while(i <= j && !(alphaNum(s.charAt(i)))) {
            i++;
        }

        while(i <= j && !(alphaNum(s.charAt(j)))) {
            j--;
        }

        if(i <= j && Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
            return false;
        }

        i++;
        j--;

       } 

       return true;
    }

    private boolean alphaNum(char c) {
        if(c >= 'a' && c <= 'z' ||
           c >= 'A' && c <= 'Z' ||
           c >= '0' && c <= '9' ) {
            return true;
        }
        return false;
    }
}
