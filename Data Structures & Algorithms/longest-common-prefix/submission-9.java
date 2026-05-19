class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1)
            return strs[0];

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            int j = 0;
            while(j < Math.min(strs[i].length(), prefix.length()) && strs[i].charAt(j) == prefix.charAt(j)) {
              j++;
            }

            prefix = strs[i].substring(0,j);
        }

        return prefix.toString();
    }
}