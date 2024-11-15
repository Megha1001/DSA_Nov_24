package arrays.stocksBuyAndSell;

public class StockBuyAndSellNaiveSolution {
    public static int profit=0;

    public static void main(String args[]){
        int arr[] = {1, 5, 3, 8, 12};

        System.out.println("The maximum profit that we can have is : "+profit);
    }  


    public static int findMaxProfit(int arr[], int start, int end){

        if(start<=end){
            return 0;
        }

        for(int i=0; i<end;i++){ //here we are going till with i=n-2 since we can't find succeding pair for end element (n-1)

        }



    }

}
