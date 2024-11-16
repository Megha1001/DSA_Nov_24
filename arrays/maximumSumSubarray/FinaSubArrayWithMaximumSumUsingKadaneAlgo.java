package arrays.maximumSumSubarray;

/*
 * LOGIC : Use Kadence's algo
 *  Find maximum sum of subarray that ends with this element.
 *  max_ending(i) = Math.max(max_ending(i-1)+arr[i], arr[i])
 * 
 * TIME COMPLEXITY : O(N)
 */

public class FinaSubArrayWithMaximumSumUsingKadaneAlgo {

    public static void main(String args[]){
        int arr[] = {-5, 1, -2, 3, -1, 2, -2};

        System.out.println("Maximum sum of subarray that can be obtained for given array is "+findMaximumSum(arr, arr.length));
    }

    public static int findMaximumSum(int arr[], int n){

        int max_ending = arr[0];
        int res = arr[0];

        for(int i = 1; i < n; i++){
            max_ending = Math.max(max_ending+ arr[i], arr[i]);
            res = Math.max(res, max_ending);
        }

        return res;

    }
    
}
