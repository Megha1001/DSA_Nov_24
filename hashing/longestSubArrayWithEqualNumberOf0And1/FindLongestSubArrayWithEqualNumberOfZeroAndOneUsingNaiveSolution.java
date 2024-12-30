package hashing.longestSubArrayWithEqualNumberOf0And1;

/*
 * TIME COMPLEXITY : Theta(N*N)
 * AUXILIARY SPACE : O(1)
 */

public class FindLongestSubArrayWithEqualNumberOfZeroAndOneUsingNaiveSolution {

    public static void main(String [] args){
        // int arr[] = {1, 0, 1, 1, 1, 0, 0};
        // int arr[] = {1, 1, 1, 1, 1};
        // int arr[] = {0,0,1,1,1,1,1,0};
        int arr[] = {0,0,1,0,1,1};
        System.out.println("The longest subarray with equal number of 0's and 1's is : "+findLongestSubArray(arr, arr.length));
    }


    public static int findLongestSubArray(int arr[], int n){
        int res = 0;

        for(int i=0; i<n; i++){
            int countOne=0, countZero=0;

            for(int j=i; j<n; j++){
                if(arr[j]==0){
                    ++countZero;
                }else{
                    ++countOne;
                }

                if(countZero == countOne){
                    res = Math.max(res, j-i+1); // res = Math.max(res, countZero+CountOne)
                }

            }

        }

        return res;

    }
    
}
