package arrays.maximumCircularSubarray;

/*
 * Logic : There can be two possible subarray category
 *  1. Normal subarray : Kadane's algo
 *  2. Circular subarray : sum - minsubarray
 *      1. Invert all the array elements
 *      2. found maximum Sub array --> By finding the maximum in the inverted array we are actually finding min in the array
 *      3. add to total sum of array
 */

public class FindMaximumCircularSubArrayUsingMofiedkadaneAlgoMostEfficient {
    


    public static void main(String args[]){
        int arr[] = {3, -4, 5, 6, -8, 7};
        System.out.println("The maximum sum of circular subarray is : "+findMaximumSumInCircularSubarray(arr, arr.length));
    }


    public static int findMaximumSumInCircularSubarray(int arr[], int n){

        int max_sum = findMaxSumUsingKadaneAlgo(arr, n);

        //in that case all the elements in the arrays are -ve, and normal kadane's algo should already provided us the min in those -ve and that would be our answer
        if(max_sum < 0){
            return max_sum;
        }

        int sum_arr = 0;

        for(int i = 0; i < n; i++){
            sum_arr += arr[i];
            arr[i] = - arr[i];
        }

        int min_sum = sum_arr + findMaxSumUsingKadaneAlgo(arr, n);

        return Math.max(max_sum, min_sum);

    }


    public static int findMaxSumUsingKadaneAlgo(int arr[], int n){
        int res = arr[0];
        int max_ending = arr[0];

        for(int i = 1; i < n; i++){
            max_ending = Math.max(max_ending + arr[i], arr[i]); // extend or start
            res = Math.max(res, max_ending);
        }

        return res;

    }

}
