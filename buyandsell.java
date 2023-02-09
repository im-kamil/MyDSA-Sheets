class Solution {
    public int maxProfit(int[] prices) {
        int minprices = Integer.MAX_VALUE;
        int maxprofit =0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minprices)
               minprices = prices[i];
               else if (prices[i] - minprices > maxprofit)
                maxprofit = prices[i]-minprices;
        }
        return maxprofit;
    }
}