package hashing.longestCommonSpanWithSameSumInBinaryArrays;

/*
 * Question: Find out the length of longest common span with equal sum and same starting and ending index and same length.
 */

public class FindLongestCommonSpanWithSameSumInBinaryArraysUsingNaiveApproach {

    public static void main(String args[]){
        int arr1[] = {0,1,0,0,0,0};
        int arr2[] = {1,0,1,0,0,1};

        System.out.println("The length of Longest common span with same sum in binary arrays is : "+findLength(arr1, arr2, arr1.length, arr2.length));
    }
    
}
