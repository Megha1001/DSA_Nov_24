package hashing.subArrayWithSumX;

/*
 * TIME COMPLEXITY : O(N*N)
 * AUXILIARY SPACE : O(1)
 */

public class CheckIfSubArrayWithSumXExistsNaiveApproach {

    public static void main(String args[]){
        int arr[] = {5, 8, 6, 13, 3, -1};
        int x = 21;

        System.out.println("Does subarray with sum "+x+" exists ?"+checkIfSubArrayExists(arr, arr.length, x));
    }


    public static boolean checkIfSubArrayExists(int arr[], int n, int x){
        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=i; j<n; j++){
                if(sum==x){
                    return true;
                }
                sum += arr[j];
            }
        }

        return false;
    }
    
}
