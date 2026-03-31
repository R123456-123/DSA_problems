class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
      int n = temperatures.length;
      int[] res = new int[n];

      for(int i = 0; i < n - 1; i++) {
        int temp = temperatures[i];
        int j = i;
        while(j < n) {
          if(temperatures[j] > temp) {
            res[i] = j - i;
            break;
          }
          j++;
        }
      }  
      return res;
    }
}
