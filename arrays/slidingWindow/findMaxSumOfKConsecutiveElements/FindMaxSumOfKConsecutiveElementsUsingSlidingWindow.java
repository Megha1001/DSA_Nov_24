package arrays.slidingWindow.findMaxSumOfKConsecutiveElements;


/*
 * TIME COMPLEXITY : Theta(N)
 * AUXILIARY SPACE : O(1)
 */
public class FindMaxSumOfKConsecutiveElementsUsingSlidingWindow {
    
    public static void main(String args[]){
        int arr[] = {1, 8, 30, -5, 20, 7};
        int k = 3;
        System.out.println("Maximum sum of k consecutive elements is "+findMaxSum(arr, arr.length, k));
    }

    public static int findMaxSum(int arr[], int n , int k){

        //find sum of first k elements
        int currSum = 0;
        for(int i = 0; i < k; i++){
            currSum += arr[i];
        }
        int res = currSum;
        for(int i = 1; i<= (n - k - 1); i++){
            currSum = currSum - arr[i-1] + arr[i+k-1];
            res = Math.max(currSum, res);

        }

        return res;

    }
}
