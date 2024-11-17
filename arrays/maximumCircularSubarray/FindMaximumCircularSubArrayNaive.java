package arrays.maximumCircularSubarray;

/*
 * LOGIC : Consider all subarray and find the maximum sum
 * 1. Consider all the subarray starting with position i -> there can be N Subarray for every element in circular array case only (otherwise N-1)
 */

public class FindMaximumCircularSubArrayNaive {

    public static void main(String args[]){
        int arr[] = {3, -4, 5, 6, -8, 7};
        System.out.println("The maximum sum of circular subarray is : "+findMaximumSumInCircularSubarray(arr, arr.length));
    }

    public static int findMaximumSumInCircularSubarray(int [] arr, int n){

        int res = arr[0];

        for(int i = 0; i < n; i++){
            int curr_sum = arr[i];
            int curr_max = arr[i];

            for(int j = 1; j < n; j++){ //should always run N times in case of circular array
                int index = ( i + j ) % n;
                curr_sum += arr[index];
                curr_max = Math.max(curr_max, curr_sum);
            }

            res = Math.max(res, curr_max);

        }

        return res;

    }
    
}
