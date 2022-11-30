package array;
//Problem Statement:The cost of a stock on each day is given in an array, find the max profit that you 
//can make by buying and selling in those days. For example, if the given array is
//{100, 180, 260, 310, 40, 535, 695}, the maximum profit can earned by buying on day 0, selling on
//day 3. Again buy on day 4 and sell on day 6. If the given array of prices is sorted in decreasing 
//order, then profit cannot be earned at all.

//Approach1: A simple approach is to try buying the stocks and selling them on every single day when 
//profitable and keep updating the maximum profit so far.

public class StockBuySell {
	public static int maxProfit(int[] price, int start, int end) {
		if(end <= start)
			return 0;
		int profit = 0;
		for( int i = start; i < end; i++) {
			for(int j = i + 1; j<= end; j++) {
				if(price[j] > price[i]) {
					int curr_profit = price[j] - price[i]
                            + maxProfit(price, start, i - 1)
                            + maxProfit(price, j + 1, end);
					profit = Math.max(curr_profit, profit);
				}
			}
		}
		return profit;
	}
//	Efficient approach: If we are allowed to buy and sell only once, then we can use following 
//	algorithm. Maximum difference between two elements. Here we are allowed to buy and sell multiple 
//	times. 
//	Following is the algorithm for this problem.  

//	Find the local minima and store it as starting index. If not exists, return.
//	Find the local maxima. and store it as an ending index. If we reach the end, set the end as the
//	ending index.
//	Update the solution (Increment count of buy-sell pairs)
//	Repeat the above steps if the end is not reached.

	public static void main(String[] args) {
		int price[] = { 100, 180, 260, 310,
                40, 535, 695 };
		int n = price.length;

		System.out.print(maxProfit(price, 0, n - 1));

	}

}
