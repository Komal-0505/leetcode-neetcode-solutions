/*
//Brute Force

class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit1 = 0;
        for(int i = 0;i<prices.length;i++){
            for(int j =i+1; j<prices.length;j++ ){
                if(prices[j]>prices[i]){
                    maxProfit1 = Math.max(prices[j] - prices[i],maxProfit1);
                }
            }
        }
        return maxProfit1;
    }
}
*/


class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            // Update minimum price (best buying day so far)
            minPrice = Math.min(minPrice, prices[i]);

            // Calculate profit if sold today
            int profit = prices[i] - minPrice;

            // Update maximum profit
            maxProfit = Math.max(maxProfit, profit);
        }

        return maxProfit;
    }
}


