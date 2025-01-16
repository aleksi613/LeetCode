class Solution {
    public int maxProfit(int[] prices) {
        int priceMin = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < priceMin) {
                priceMin = price;
            }

            int profit = price - priceMin;

            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }
}
