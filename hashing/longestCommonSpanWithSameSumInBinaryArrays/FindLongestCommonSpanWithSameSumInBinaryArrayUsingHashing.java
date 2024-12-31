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
 * Assumption : Both arrays are of same length
 */

public class FindLongestCommonSpanWithSameSumInBinaryArrayUsingHashing {

    public static void main(String args[]){

        int a1[] = {0,1,0,0,0,0};
        int a2[] = {1,0,1,0,0,1};

        System.out.println("The longest common span with same sum in binary array of same length and same starting and ending index is : "+findLength(a1, a2, a1.length));

    }
    
    public static int findLength(int a1[], int a2[], int n){
        int temp[] = new int[n];

        //Step1. Compute a difference array
        for(int i=0; i<n; i++){
            temp[i] = a1[i] - a2[i];
        }

        return findLongestSubArrayWithSumZero(temp, n);

    }


    public static int findLongestSubArrayWithSumZero(int arr[], int n){
        
    }
    
}
