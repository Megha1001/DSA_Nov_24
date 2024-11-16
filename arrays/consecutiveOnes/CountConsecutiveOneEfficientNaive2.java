package arrays.consecutiveOnes;

/*
 * TIME COMPLEXITY : Theta(N^2)
 * AUXILIARY SPACE : Theta(1)
 */

public class CountConsecutiveOneEfficientNaive2 {
    
    public static void main(String args[]){
        // int arr[] = {1, 0, 0, 0, 0};
        // int arr[] = {0, 1, 1, 0, 1, 0};
        // int arr[] = {1, 1, 1, 1, 1};
        // int arr[] = {0, 0, 0, 0, 0};
        int arr[] = {1, 0, 1, 1, 1, 1, 0, 1, 1};

        System.out.println("Maximum consecutive 1's in given array is "+countConsecutiveOnes(arr, arr.length));
    }


    public static int countConsecutiveOnes(int[]arr, int n){
        int res = 0;

        for(int i = 0; i < n; i++){
            int curr = 0;
            for(int j = i; j < n; j++){ //finding max consecutive one that start when arr[i] == 1;
                if(arr[j] == 1){
                    ++curr;
                }else{
                    break;
                }
            }
            res = Math.max(res, curr);
        }

        return res;
    }

}
