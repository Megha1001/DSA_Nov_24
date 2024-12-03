package sorting.MergeSort;

public class SortArrayUsingMergeSortAlgo {

    public static void main(String args[]){
        int arr[] = {4, 0, 9, 1, 2, 3, 3, 4, 2, 19};
        System.out.println("Array after sorting using merge sort is ");
        int left  = 0, right = arr.length - 1;
        mergeSort(arr, left, right);

        for(int i = left; i <= right; i++){
            System.out.print(arr[i] + " ");
        }
    }


    public static void mergeSort(int arr[], int l, int r){

    }
    
}
