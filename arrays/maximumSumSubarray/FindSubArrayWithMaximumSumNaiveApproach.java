package arrays.maximumSumSubarray;



/*
 * Subarray : A subarray is contigous portion of an array or a subarray consists of sequence of elements that appear consecutively in the original array
 * LOGIC : Find all the subarrays and update the res accordingly
 * 1. Find all the subarray that can be constructed by numbers present at position 'i'
 * 2. Update the res only when the curr sum > res
 */

public class FindSubArrayWithMaximumSumNaiveApproach {

    public static void main(String args[]){
        int arr[] = {1, -2, 3, -1, 2};

        System.out.println("Maximum sum of subarray that can be obtained for given array is "+findMaximumSum(arr, arr.length));
    }


    public static int findMaximumSum(int arr[], int n){
        int res = arr[0];

        for(int i = 0; i < n; i++){

            int curr = 0;

            for(int j = i; j < n; j++){

                curr += arr[j];
                res = Math.max(curr, res);

            }

        }

        return res;
    }


    
}
