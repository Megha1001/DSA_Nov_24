package hashing.longestSubArrayWithGivenSum;

/*
 * TIME COMPLEXITY : O(N*N)
 * AUXILIARY SPACE : O(1)
 */

public class FindLongestSubArrayWithGivenSumNaiveApproach {

    public static void main(String args[]){
        int arr[] = {5,8,-4,-4,9,-2,2};
        int x = 0;

        System.out.println("The longest subarray with given sum is : "+findLongestSubArrayLengthWithGivenSum(arr, arr.length,x));
    }


    public static int findLongestSubArrayLengthWithGivenSum(int arr[], int n, int x){

        int res = 0;
        for(int i=0; i<n; i++){
            int sum=0;
            for(int j=i; j<n; j++){
                sum+=arr[j];
                if(sum==x){
                    res = Math.max(res, j-i+1);
                }
            }
        }

        return res;

    }
    
}
