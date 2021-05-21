//Stock Buy Sell to Maximize Profit // Multiple buy and sell for max profit
/*
The cost of a stock on each day is given in an array, find the max profit that you can make by buying and selling in those days. For example, if the given array is {100, 180, 260, 310, 40, 535, 695}, the maximum profit can earned by buying on day 0, selling on day 3. Again buy on day 4 and sell on day 6. If the given array of prices is sorted in decreasing order, then profit cannot be earned at all.
*/
package rwitesh.recursion;
public class Stock_Buy_and_Sell {
    static int maxProfit(int price[], int start, int end)
    {
        if(end<=start)
        {
            return  0;
        }

        //Initial profit is 0
        int profit = 0;

        //Day in which stock must be bought
        for(int i=start ; i<end ; i++)
        {
            //Day in which stock must be sold
            for(int j=i+1; j<=end ; j++)
            {
                if(price[j]>price[i])
                {
                    int curr_profit = price[j]-price[i]
                            +maxProfit(price, start,i-1)
                            +maxProfit(price,j+1,end);

                    //Update the max profit so far
                    profit = Math.max(profit,curr_profit);
                }
            }
        }
        return  profit;
    }
    public static void main(String[] args) {
        int price[] = { 10,15,21,26,8,11,25,6};
        int n = price.length;
        System.out.println(maxProfit(price,0,n-1));
    }
}
