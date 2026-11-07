class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int lowestPrice = 100;
        for (int i = 0; i < prices.length; i++) {
            if (lowestPrice > prices[i]) {
                lowestPrice = prices[i];
            }
            int currentProfit = prices[i] - lowestPrice;
            profit = currentProfit > profit ? currentProfit : profit ;
        }
        return profit;
    }
}
