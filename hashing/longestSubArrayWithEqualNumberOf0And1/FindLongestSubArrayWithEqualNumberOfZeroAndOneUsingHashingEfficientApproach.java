package hashing.longestSubArrayWithEqualNumberOf0And1;

import java.util.HashMap;

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
        int arr[] = {1, 0, 1, 1, 1, 0, 0};
        // int arr[] = {1, 1, 1, 1, 1};
        // int arr[] = {0,0,1,1,1,1,1,0};
        // int arr[] = {0,0,1,0,1,1};
        System.out.println("The longest subarray with equal number of 0's and 1's is : "+findLongestSubArray(arr, arr.length));
    }


    public static int findLongestSubArray(int arr[], int n){
        
        //convert 0->-1
        for(int i=0; i<n; i++){
            if(arr[i]==0){
                arr[i]=-1;
            }
        }

        //call findLongestSubArrayWithSumZero
        return findLongestSubArrayWithSumZero(arr, n);

    }

    public static int findLongestSubArrayWithSumZero(int arr[], int n){

        int res=0, sum=0;
        int x = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            sum += arr[i];

            if(sum==x){
                res = i+1;
            }else if(!map.containsKey(sum)){
                map.put(sum, i);
            }else if(map.containsKey(sum-x)){
                res = Math.max(res, i - map.get(sum-x));
            }
        }

        return res;

    }
    
}
