class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int Min_Price=Integer.MAX_VALUE;
        int i=0;
        int j=prices.length;
while(i<j){
if(prices[i]<Min_Price){
    Min_Price=prices[i];
}
else{
maxProfit=Math.max(maxProfit,prices[i]-Min_Price);
}
i++;
}
return maxProfit;
    }
}
