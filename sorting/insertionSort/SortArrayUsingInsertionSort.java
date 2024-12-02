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
            System.out.print(arr[i] + " ");
        }
        
    }


    public static void sortUsingInsertionSort(int arr[], int n){

        for(int i = 1; i < n; i++){

            int key = arr[i];
            int j = i-1;
            
            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = key;

        }

    }
    
}
