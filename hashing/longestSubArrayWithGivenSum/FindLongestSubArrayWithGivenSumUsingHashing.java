package hashing.longestSubArrayWithGivenSum;

import java.util.HashMap;

/*
 * TIME COMPLEXITY : O(N)
 * AUXILIARY SPACE : O(N)
 */

public class FindLongestSubArrayWithGivenSumUsingHashing {

    public static void main(String args[]){
        // int arr[] = {5,8,-4,-4,9,-2,2};
        // int x = 0;
        int arr[] = {3,1,0,1,8,2,3,6}; //prefix sum
        int x = 5;

        System.out.println("The longest subarray with given sum is : "+findLongestSubArrayLengthWithGivenSum(arr, arr.length,x));
    }


    public static int findLongestSubArrayLengthWithGivenSum(int arr[], int n, int x){
        HashMap<Integer, Integer> map = new HashMap<>();
        int res=0;
        int sum=0;


        for(int i=0; i<n; i++){
            sum += arr[i];

            if(sum==x){
                res = Math.max(res, i+1); //it will always be a prefix sum
            } else if( map.getOrDefault( sum-x, -1) != -1){
                int lastIdx = map.get(sum-x);
                res = Math.max(res, i-lastIdx);
            }

            map.put(sum, i);

        }

    
        return res;

    }
    
}
