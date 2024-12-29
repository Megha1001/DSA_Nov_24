package hashing.pariwithGivenSumInUnsortedArray;

/*
 * TIME COMPLEXITY : O(N*N)
 */

public class FindPairWithGivenSumInUnsortedArrayUsingNaiveApproach {

    public static void main(String args[]){
        int arr[] = {3,2,8,15,-8};
        int x = 17;

        System.out.println("Pair with given sum exists in given array ? "+checkIfSumExists(arr, arr.length, x));
    }


    public static boolean checkIfSumExists(int arr[], int n, int x){

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]+arr[j]==x){
                    return true;
                }
            }
        }

        return false;
    }
    
}
