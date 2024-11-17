package arrays.slidingWindow.findMaxSumOfKConsecutiveElements;

/*
 * TIME COMPLEXITY : Theta(N^2)
 * AUXILIARY SPACE : Theta(1)
 */

public class FindMaxSumOfKConsecutiveElementsUsingNaiveApproach {

    public static void main(String args[]){
        int arr[] = {1, 8, 30, -5, 20, 7};
        int k = 3;
        System.out.println("Maximum sum of k consecutive elements is "+findMaxSum(arr, arr.length, k));
    }


    public static int findMaxSum(int arr[], int n, int k){
        int sum = 0;
        for(int i = 0 ; i <= (n-k-1) ; i ++){
            int currSum = 0;
            for (int j = i; j < i+k; j++){
                currSum += arr[j];
            }
            sum = Math.max(sum, currSum);
        }
        return sum;
    }
    
}
