class Solution {
    public int maxProfit(int[] prices) {
       int maxProfit = Integer.MIN_VALUE;

       int buy = prices[0];

       for(int sell : prices) {
        if(buy >= sell) {
            buy = sell;
        }

        maxProfit = Math.max(maxProfit, Math.abs(buy - sell));
       } 
       return maxProfit == Integer.MIN_VALUE ? 0 : maxProfit;
    }
}
