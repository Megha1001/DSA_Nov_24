package hashing.longestCommonSpanWithSameSumInBinaryArrays;

/*
 * Question: Find out the length of longest common span with equal sum and same starting and ending index and same length.
 * 
 * TIME COMPLEXITY : Theta(N*N)
 * AuXILIARY SPACE : O(1)
 */

public class FindLongestCommonSpanWithSameSumInBinaryArraysUsingNaiveApproach {

    public static void main(String args[]){
        int arr1[] = {0,1,0,0,0,0};
        int arr2[] = {1,0,1,0,0,1};

        System.out.println("The length of Longest common span with same sum in binary arrays is : "+findLength(arr1, arr2, arr1.length, arr2.length));
    }

    public static int findLength(int arr1[], int arr2[], int n1, int n2){

        int res=0;

        for(int i=0; i<n1; i++){
            int sum1=0, sum2=0;
            for(int j=i; j<n2; j++){
                sum1+=arr1[j];
                sum2+=arr2[j];

                if(sum1==sum2){
                    res = Math.max(res, j-i+1);
                }
            }
        }

        return res;
    }
    
}
