package rwitesh.array;

public class StockBuy_Sell {
    static int maxProfit(int[] arr, int size)
    {
        int maxProfit=0;
        int minSoFar = arr[0];

        for(int i=0;i<size;i++)
        {
            minSoFar = Math.min(minSoFar,arr[i]);
            int currentProfit = arr[i]-minSoFar;
            maxProfit = Math.max(maxProfit,currentProfit);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] arr={100,180,260,310,40,535,695};
        int n = arr.length;
        System.out.println("Maximum profit is "+maxProfit(arr,n));
    }
}
