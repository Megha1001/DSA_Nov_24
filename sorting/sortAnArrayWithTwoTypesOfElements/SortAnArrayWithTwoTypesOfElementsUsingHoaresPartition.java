package sorting.sortAnArrayWithTwoTypesOfElements;

/*
 * TIME COMPLEXITY : O(N)
 * AUXILIARY SPACE : Theta(1)
 * 
 * LOGIC : This is the variation of partitioning algo of quick Sort. This can be solved by using Naive, Lomuto & Hoare's partition. Here, we're using Lomuto Partition.
 */

public class SortAnArrayWithTwoTypesOfElementsUsingHoaresPartition {
    public static void main(String args[]){
        int arr[] = {13, -12, 18, -10, 10, -19};
        System.out.println("Array after partition is : ");
        segregatePosAndNeg(arr, 0, arr.length-1);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void segregatePosAndNeg(int arr[], int low, int high){
        int i = low-1;

    }
}
