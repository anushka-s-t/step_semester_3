public class Main2 {
    public static int maxProfit(int[] prices) {
        // Safety check: Handle empty or invalid arrays to prevent crashes
        if (prices == null || prices.length == 0) {
            return 0;
        }

        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }

            int profit = prices[i] - minPrice;

            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] stockPrices = {7, 1, 5, 3, 6, 4};
        int result = maxProfit(stockPrices);
        
        // Expected Output: 5 (Buy at 1, sell at 6)
        System.out.println("Maximum Profit: " + result); 
    }
}
