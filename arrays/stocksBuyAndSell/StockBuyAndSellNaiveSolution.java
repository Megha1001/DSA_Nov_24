package arrays.stocksBuyAndSell;

/*
 * TIME COMPLEXITY : O(N^2)
 * AUXILIARY SPACE : O(1)
 */

public class StockBuyAndSellNaiveSolution {

    public static void main(String args[]){
        int arr[] = {1, 5, 3, 8, 12};

        System.out.println("The maximum profit that we can have is : "+findMaxProfit(arr, 0 , arr.length-1));
    }  


    public static int findMaxProfit(int arr[], int start, int end){

        if(start>=end){
            return 0;
        }
        //here we are going till with i=n-2 since we can't find succeding pair for end element (n-1)
        int profit=0;
        
        for(int i = start; i < end; i++){
            for(int j = i + 1; j <= end; j++){
                if(arr[j] > arr[i]){
                    int currProfit = arr[j] - arr[i]
                                    + findMaxProfit(arr, start, i - 1)
                                    + findMaxProfit(arr, j + 1, end);
                    profit = Math.max(profit, currProfit);
                }
            }
        }

        return profit;

    }

    
}
