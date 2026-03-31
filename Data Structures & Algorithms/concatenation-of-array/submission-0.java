class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] res = new int[n * 2];
        
        int i = 0, j = n; 
        for(int num : nums) {
            res[i++] = num;
            res[n++] = num;
        }
        return res;
    }
}