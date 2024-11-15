package arrays.stocksBuyAndSell;

/*
 * LOGIC : 
 * The idea is based on the fact, we know the prices in advance. 
 * If the prices of the stock are going down, you will let thme go down. and once the price has reached bottom at that point,
 * you will budy this sotck and then when they are going up you will let them go up once they reached a Peat at that point, you 
 * will sell the stock
 * 
 * TIME COMPLEXITY : Theta(N)
 * AUXILIARY SPACE : Theta(1)
 */


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
