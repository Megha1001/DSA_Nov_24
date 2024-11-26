package searching.twoPointerApproach;

public class FindIfPairWithSumXExists {

    public static void main(String args[]){
        int arr[] = {2, 5, 8, 12, 30};
        int x = 19;
        System.out.println("is there a pair with sum "+x+" ? "+isPairExists(arr, arr.length, x));
    }


    public static boolean isPairExists(int arr[], int n, int x){
        int i = 0;
        int j = n-1;

        for(i = 0; i < n && j > 0;){
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
