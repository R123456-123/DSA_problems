class Solution {
    public int tribonacci(int n) {
        if(n <= 1) return n;
        if(n == 2) return 1;
        
        int a = 0;
        int b = 1;
        int c = 1;

        for(int i = 3; i <= n; i++) {
           int cur = c + b + a;

           a = b;
           b = c;
           c = cur;
        }

        return c;
    }
}