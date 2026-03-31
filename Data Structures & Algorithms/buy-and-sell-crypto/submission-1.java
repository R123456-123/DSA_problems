class Solution {
    public int maxProfit(int[] prices) {
       int maxAmount = 0;

       int buy = prices[0];
       for(int sell : prices) {
          if(sell < buy) {
            buy = sell;
          }
          maxAmount = Math.max(maxAmount, sell - buy);
       }
       return maxAmount;
    }
}
