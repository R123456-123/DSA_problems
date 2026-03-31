class Solution {
    public boolean isPalindrome(String s) {
      int left = 0;
      int right = s.length() - 1;

      while(left < right) {
        while(left < right && !alpNum(s.charAt(left))) {
            left++;
        }

        while(left < right && !alpNum(s.charAt(right))){
            right--;
        }

        if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
          return false;
        }
        left++;
        right--;
      }
      return true;
    }

    private boolean alpNum(char c) {
        return (c >= '0' && c <= '9' || c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z');
    }
}
