package arrays.maximumCircularSubarray;

/*
 * LOGIC : 
 *  There can be two possibility where max sum can be found
 *  1. Maximum sum in normal subarray(Kadane's algo)
 *  2. Maximum sum in circular subarray(Modified Kadane's algo) 
 *      --> To find maximum in circular array = total sum -  find min array in normal 
 * 
 * TIME COMPLEXITY : Theta(N)
 * AUXILIARY SPACE : Theta(1)
 */

public class FindMaximumCircularSubArrayModifiedKadanesAlgoEfficient {
    

    public static void main(String args[]){
        int arr[] = {3, -4, 5, 6, -8, 7};
        System.out.println("The maximum sum of circular subarray is : "+findMaximumSumInCircularSubarray(arr, arr.length));
    }


    public static int findMaximumSumInCircularSubarray(int arr[], int n){

        int max_sum = arr[0];
        int max_ending = arr[0];
        int min_sum = arr[0];
        int min_ending = arr[0];
        int sum = arr[0];

        for(int i = 1; i < n; i++){
            max_ending = Math.max(max_ending + arr[i] , arr[i]);
            min_ending = Math.min(min_ending + arr[i], arr[i]);

            max_sum = Math.max(max_sum, max_ending);
            min_sum = Math.min(min_sum, min_ending);

            sum += arr[i];

        }

        return Math.max(sum - min_sum, max_sum);

    }

}
