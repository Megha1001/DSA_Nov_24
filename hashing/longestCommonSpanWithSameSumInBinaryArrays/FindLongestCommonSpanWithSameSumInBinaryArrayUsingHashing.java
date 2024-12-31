package hashing.longestCommonSpanWithSameSumInBinaryArrays;

/*
 * LOGIC : Use Hashing and findLongestSubArrayWithSumZero solution
 * 
 * 1. Compute a difference array
 *  a1[] = {0,1,0,0,0,0};
 * a2[] = {1,0,1,0,0,1};
 * temp[]= {-1,1,-1,0,0,-1};
 * 
 * 2.Return the length of the longest Subarray with 0 sum in temp
 *  Values in temp
 *      - We get 0 when values are same in both
 *      - We get 1 when a1[i]=1 and a2[i]=0
 *      - We get -1 when a1[i]=0 and a2[i]=1
 * 
 */

public class FindLongestCommonSpanWithSameSumInBinaryArrayUsingHashing {

    public static void main(String args[]){

        int a1[] = {0,1,0,0,0,0};
        int a2[] = {1,0,1,0,0,1};



    }
    
}
