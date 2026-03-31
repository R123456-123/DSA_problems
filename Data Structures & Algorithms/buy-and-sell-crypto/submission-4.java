class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;

        int buy = prices[0];

        for(int sell : prices) {
            buy = Math.min(buy, sell);
            int profit = sell - buy;
            maxProfit = Math.max(maxProfit, profit);
        }

        return maxProfit;
    }
}