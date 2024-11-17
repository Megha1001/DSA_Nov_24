package arrays.majorityElement;


/*
 * Majority element: An element is known as majority when it appears more than n/2 times
 *  Logic  : Consider every element as majority
 * 
 * TIME COMPLEXITY : O(N^2)
 * AUXILIARY SPACE : Theta(1)
 */

public class FindMajorityElementNaiveSolution {

    public static void main(String args[]){
        // int arr[] = {8, 3, 4, 8, 8};
        int arr[] = {3, 7, 4, 7, 7, 5};
        System.out.println("Majority element in given array is "+findMajority(arr, arr.length));
    }

    public static int findMajority(int arr[], int n){

        int res = -1;

        for(int i = 0; i < n; i++){
            int count = 0;
            for(int j = i; j < n; j++){
                if(arr[i] == arr[j]){
                    ++count;
                }
            }
            if(count > n/2) {
                return i;
            }
        }

        return res;

    }
    
}
