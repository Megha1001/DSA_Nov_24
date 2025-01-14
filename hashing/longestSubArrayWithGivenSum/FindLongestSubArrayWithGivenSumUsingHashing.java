package hashing.longestSubArrayWithGivenSum;

import java.util.HashMap;

/*
 * TIME COMPLEXITY : Theta(N)
 * AUXILIARY SPACE : O(N)
 */

public class FindLongestSubArrayWithGivenSumUsingHashing {

    public static void main(String args[]){
        int arr[] = {5,8,-4,-4,9,-2,2};
        int x = 0;
        // int arr[] = {3,1,0,1,8,2,3,6}; //prefix sum
        // int x = 5;

        // int arr[] = {8, 3, 7};
        // int x = 15;

        System.out.println("The longest subarray with given sum is : "+findLongestSubArrayLengthWithGivenSum(arr, arr.length,x));
    }


    public static int findLongestSubArrayLengthWithGivenSum(int arr[], int n, int x){
        HashMap<Integer, Integer> map = new HashMap<>();
        int res=0;
        int sum=0;


        for(int i=0; i<n; i++){
            sum += arr[i];

            if(sum==x){
                // res = Math.max(res, i+1); //it will always be a prefix sum
                //No need to do max comparision since this would be prefix sum. Hence, it would be maximum
                res = i+1;
            } else if(!map.containsKey(sum)){
                //we should not replace the prefix sum if it already exists : Ex : {8,3,1,5,-6,6,2,2}
                map.put(sum,i);
            }else if( map.getOrDefault( sum-x, -1) != -1){ //map.containsKey(sum-x)
                int lastIdx = map.get(sum-x);
                res = Math.max(res, i-lastIdx);
            }


        }

    
        return res;

    }
    
}
