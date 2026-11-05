class Solution {
    public int maxProfit(int[] prices) {
        int left=0;
        int maxValue=0;

        for(int right=1;right<prices.length;right++){
            if(prices[right]<prices[left]){
                left=right;
            }
            maxValue = Math.max(maxValue, prices[right]-prices[left]);
        }
        return maxValue;
    }
}
