package hashing.longestConsecutiveSubSequence;

import java.util.Arrays;

/*
 * Question : We need to find the longest subsequence in the form of x, x+1, x+2, ...., x+i with these element appearing in ANY order
 * 
 * TIME COMPLEXITY : O(NlogN)
 * AUXILIARY SPACE : O(1)
 */

public class FindLongestConsecutiveSubSequenceLengthUsingNaiveApproach {

    public static void main(String args[]){
        // int arr[] = {1,9,3,4,2,20};
        // int arr[] = {8,20,7,30};
        // int arr[] = {10,20,30};

        int arr[] = {2,3,3,4,5};
        
        System.out.println("The longest consecutive subsequence length in given array is : "+findLongestSubSequenceLengthWithConsecutiveElements(arr, arr.length));
    }

    public static int findLongestSubSequenceLengthWithConsecutiveElements(int arr[], int n){

        int res = 1;

        Arrays.sort(arr);

        //Checking in two traversal -> Theta(N*N)
        // for(int i=0; i<n; i++){
        //     int count=1;
        //     for(int j=i+1; j<n; j++){
        //         if(arr[j]-arr[j-1]==1){
        //             ++count;
        //         }else{
        //             count=1;
        //         }
        //         res = Math.max(res, count);
        //     }
        // }
        

        //Checking in one traversal -> Theta(N)
        int count = 1;
        for(int i = 0; i < n - 1; i++){
            if(arr[i+1]-arr[i]==1){
                ++count;
            }else{
                res = Math.max(res, count);
                count=1;
            }
        }

        return Math.max(res, count); // for array like : {2,3,4,9,10,11,12}

    }
    
}
