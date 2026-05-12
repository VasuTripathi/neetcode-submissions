class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int left = 0;
        int right =  1;
        int profit = 0;
        int maxProf = 0;
        while (right < n) {
            if (prices[left] < prices[right]) {
                profit = prices[right] - prices[left];
                maxProf = Math.max(maxProf, profit);
            } else {
                left = right;
            }
            right++;
        }
        return maxProf;
    }
}
