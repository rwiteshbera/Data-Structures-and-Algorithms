package rwitesh.array;

public class StockBuy_Sell_2 {
    static int maxProfit(int[] price)
    {
        int profit = 0;
        for(int i=1; i<price.length; i++)
        {
            if(price[i]>price[i-1]) {
                profit += (price[i] - price[i-1]);
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] arr={100,180,260,310,40,535,695};
        System.out.println("Maximum profit is "+maxProfit(arr));
    }
}
