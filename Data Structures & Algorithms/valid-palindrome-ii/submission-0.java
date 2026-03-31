class Solution {
    public boolean validPalindrome(String s) {
        int n = s.length();
        if(s == null || n == 0 ) return false;

        if(n == 1) return true;

        int left = 0, right = n - 1;

        while(left < right) {
            if(s.charAt(left) != s.charAt(right)) {
                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
            } 
            left++;
            right--;
        }

        return true;
    }

    private boolean isPalindrome(String s, int left, int right) {
        while(left < right) {
            if(s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}