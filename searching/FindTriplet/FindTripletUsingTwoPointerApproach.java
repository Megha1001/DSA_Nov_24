package searching.FindTriplet;

/*
 * LOGIC : Use Pair Sum problem as a subrouting
 * 
 * 1. Traverse the array from left to right
 * 2. FOr every element arr[i], check if there is a pair on right hand side with sum x-arr[i]
 * 
 * TIME COMPLEXITY: O(N^2)
 * AUXILIARY SPACE : O(1)
 */

public class FindTripletUsingTwoPointerApproach {
    
    public static void main(String args[]){
        int arr[] = {2, 3, 4, 8, 9, 20, 40};
        int x = 32;
        System.out.println("is there a triplet with sum "+x+" exists ? "+isExists(arr, arr.length, x));
    }
    

    public static boolean isExists(int arr[], int n, int x){

    }

}
