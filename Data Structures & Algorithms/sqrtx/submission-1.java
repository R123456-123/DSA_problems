class Solution {
    public int mySqrt(int x) {
      if(x == 0) return 0;
      if(x == 1) return 1;

      int res = 1;
      for(int i = 1; i <= x / 2; i++) {
        
         if((long) i * i == x) {
            res = i;
            break;
         }

         if((long) i * i >= x) {
            res = i - 1;
            break;
         }   
      }

      return res;
    }
}