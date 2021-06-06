package rwitesh.array;

public class StockBuy_Sell {
    static int maxProfit(int[] arr)
    {
        int maxProfit=0;
        int currentProfit = 0;
        int minSoFar = arr[0];

        if(arr.length==0)
        {
            return 0;
        }

        for(int i=0;i<arr.length;i++)
        {
            minSoFar = Math.min(minSoFar,arr[i]);
            currentProfit = arr[i]-minSoFar;
            maxProfit = Math.max(maxProfit,currentProfit);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] arr={100,180,260,310,40,535,695};
        System.out.println("Maximum profit is "+maxProfit(arr));
    }
}
