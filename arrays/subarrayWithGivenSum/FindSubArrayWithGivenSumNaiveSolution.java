package arrays.subarrayWithGivenSum;

/*
 * TIME COMPLEXITY : O(N^2)
 * AUXILIARY SPACE : O(1)
 */

public class FindSubArrayWithGivenSumNaiveSolution {

    public static void main(String args[]){
        int arr[] = {1, 4, 20, 3, 10, 5};
        int sum = 33;
        System.out.println("Do se have suarray with given sum : "+checkSum(arr, arr.length, sum));
    }

    public static boolean checkSum(int arr[], int n, int x){
        boolean res = false;

        for(int i = 0; i < n; i++){
            int curr = 0;
            for(int j = i; j < n; j++){
                curr += arr[j];
                if(curr == x){
                    return true;
                }
                else if(curr > x){
                    break;
                }
            }
        }


        return res;

    }
    
}
