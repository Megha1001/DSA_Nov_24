package arrays.checkArrayIsSorted;

/*
 * TIME COMPLEXITY : O(N)
 * AUXILIARY SPACE : Theta(1)
 */

public class CheckIfArrayIsNaturalSortedEfficientApproach {
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6};
        int arr1[] = {10,10,10,10};
        int arr2[] = {10,7,8,3,4,7};
        System.out.println("Are the given array sorted ? ");
        System.out.println("arr : "+checkIfSorted(arr, arr.length));
        System.out.println("arr1 : "+checkIfSorted(arr1, arr1.length));
        System.out.println("arr2 : "+checkIfSorted(arr2, arr2.length));

    }

    public static boolean checkIfSorted(int arr[], int n){

        for(int i=1; i<n; i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }

        return true;
    }

}
