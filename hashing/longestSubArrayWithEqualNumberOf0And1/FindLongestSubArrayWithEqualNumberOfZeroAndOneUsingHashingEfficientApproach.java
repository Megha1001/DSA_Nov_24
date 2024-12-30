package hashing.longestSubArrayWithEqualNumberOf0And1;

/*
 * Logic : Use logic of find longest subarray with given sum logic 
 * 1. Convert all zeroes to -1
 * 2. Use method to findLongestSubArrayWithSumZero;
 * 
 * TIME COMPLEXITY : Theta(N)
 * AUXILIARY SPACE : O(N)
 */

public class FindLongestSubArrayWithEqualNumberOfZeroAndOneUsingHashingEfficientApproach {

    public static void main(String [] args){
        // int arr[] = {1, 0, 1, 1, 1, 0, 0};
        // int arr[] = {1, 1, 1, 1, 1};
        // int arr[] = {0,0,1,1,1,1,1,0};
        int arr[] = {0,0,1,0,1,1};
        System.out.println("The longest subarray with equal number of 0's and 1's is : "+findLongestSubArray(arr, arr.length));
    }


    public static int findLongestSubArray(int arr[], int n){
        
        //convert 0->-1

    }
    
}
