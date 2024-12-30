package hashing.subArrayWithSumZero;

/*
 * TIME COMPLEXITY : O(N*N)
 * AUXILIARY SPACE : O(1)
 */

public class CheckSubArrayWithSumZeroExistsUsingNaiveApproach {

    public static void main(String args[]){

        int arr[] = {-3, 4, -3, -1, 1};
        System.out.println("Does subarray with sum zero exists ? "+isSubArrayWithSumZeroExists(arr,arr.length));

    }
    

    public static boolean isSubArrayWithSumZeroExists(int arr[], int n){

        for(int i=0; i<n; i++){
            int currSum=0;
            for(int j=i; j<n; j++){
                currSum += arr[j];
                if(currSum==0){
                    return true;
                }
            }
        }

        return false;

    }

}
