import java.util.ArrayList;
import java.util.List;

public class Main {
  public static int maxProfit(int[] prices) {
    if (prices == null || prices.length == 0) {
      return 0;
    }

    int maxProfit = 0;

    for (int i=0; i < prices.length; i++) {
      for (int j=i+1; j < prices.length; j++) {
        int profit = prices[j] - prices[i];
        if (profit > 0) {
          maxProfit = Math.max(maxProfit, profit);
        }
      }
    }

    return maxProfit;
  }

  public static void main(String[] args) {
    int[] prices1 = {7,1,5,3,6,4};
    int[] prices2 = {7,6,4,3,1};

    System.out.println("Profit prices1: " + maxProfit(prices1));
    System.out.println("Profit prices2: " + maxProfit(prices2));
  }
}
