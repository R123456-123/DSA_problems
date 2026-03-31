class Solution {
    public int maxProfit(int[] prices) {
        int maxPro = Integer.MIN_VALUE;

        for(int i = 0; i < prices.length; i++) {
          int j = i;
          while(j < prices.length) {
            maxPro = Math.max(maxPro, prices[j] - prices[i]);
            j++;
          }
        }
        return maxPro == Integer.MIN_VALUE ? 0 : maxPro;
    }
}
