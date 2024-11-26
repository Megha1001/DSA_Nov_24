package searching.twoPointerApproach;

/*
 * TIME COMPLEXITY : O(N)
 * AUXILIARY SPACE : Theta(1)
 */

public class FindIfPairWithSumXExists {

    public static void main(String args[]){
        int arr[] = {2, 5, 8, 12, 30};
        int x = 24;
        System.out.println("is there a pair with sum "+x+" ? "+isPairExists(arr, arr.length, x));
    }


    public static boolean isPairExists(int arr[], int n, int x){
        int i = 0;
        int j = n-1;

        while(i < j){
            int sum = arr[i] + arr[j];
            if(sum == x){
                return true;
            }
            else if(sum > x){
                --j;
            } else{
                ++i;
            }
        }

        return false;

    }
    
}
