package arrays.stocksBuyAndSell;

public class StockBuyAndSellThroughValleyPeakApproach {

    public static void main(String args[]){
        int arr[] = {1,5,3,8,12};

        System.out.println("The maximum profit that we can have is : "+findMaxProfit(arr, arr.length));
    }


    public static int findMaxProfit(int arr[], int n){
        int profit = 0;

        for(int i = 1; i < n; i++){
            if(arr[i] > arr[i-1]){
                profit += (arr[i] - arr[i-1]);
            }
        }

        return profit;

    }
    
}
