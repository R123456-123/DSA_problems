class Solution {
    public int[] countBits(int n) {
        int[] res = new int[n + 1];

        while(n >= 0) {
            int i = n;
            int count = 0;

            while(i != 0) {
               i = i & (i - 1);
               count++;
            }

            res[n] = count;

            n--; 
        }

        return res;
    }
}
