package sorting.insertionSort;

/*
 * LOGIC : 
 * - We'll having two sections of array -> sorted and one that needs sorting
 * - For current element will place it at correct position in sorted array
 * - Increase sorted array length by 1 after every iteration
 * 
 * In place and stable
 * Used in practice for small arrays -> TimSort , IntroSort
 * 
 * TIME COMPLEXITY : O(N^2)
 * Best case : O(N)
 */

public class SortArrayUsingInsertionSort {

    public static void main(String args[]){
        int arr[] = {2, 5, 8, 20, 10, 18};

        System.out.println("Array after sorting using insertion sort is : ");
        sortUsingInsertionSort(arr, arr.length);
        
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + " ");
        }
        
    }
    
}
