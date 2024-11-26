package searching.FindTriplet;

/*
 * LOGIC : Use Pair Sum problem as a subrouting
 * 
 * 1. Traverse the array from left to right
 * 2. FOr every element arr[i], check if there is a pair on right hand side with sum x-arr[i]
 * 
 * TIME COMPLEXITY: O(N^2)
 * AUXILIARY SPACE : O(1)
 * 
 * Note : here the given array is sorted, even if we have unsorted array, we can sort the array first(Complexity : O(NLogN)) then apply this method
 */

public class FindTripletUsingTwoPointerApproach {
    
    public static void main(String args[]){
        int arr[] = {2, 3, 4, 8, 9, 20, 40};
        int x = 32;
        System.out.println("is there a triplet with sum "+x+" exists ? "+isExists(arr, arr.length, x));
    }
    

    public static boolean isExists(int arr[], int n, int x){

        for(int i = 0; i < n-2; i++){
            int j = i+1, k = n-1;

            while(j < k){
                int sum = arr[j] + arr[k];
                if(sum == x - arr[i]){
                    return true;
                }else if (sum > x - arr[i]){
                    --k;
                }else{
                    ++j;
                }
            }

        }
        return false;

    }

}
