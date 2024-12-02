package sorting.selectionSort;

/*
 * LOGIC : For every iteration i, find the min element from j to n-1 
 * -> swap arr[i] with arr[minIdx]
 * 
 * In place algorithm
 * Not Stable
 * TIME COMPLEXITY : Theta(N^2)
 * AUXILIARY SPACE : O(1)
 */

public class SortArrayUsingSelectionSort {

    public static void main(String args[]){
        int arr[] = {10, 5, 8, 20, 2, 18};
        System.out.println("Array after sorting using selection sort is : ");
        sortUsingSelectionSortTechnique(arr, arr.length);


        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }

    }

    public static void sortUsingSelectionSortTechnique(int arr[], int n){
        
        //for every iteration, we find minimum element and swap with the arr[i]

        for(int i = 0; i < n-1; i++){ //last element will automatically be at its original position
            int minIdx = i;
            for(int j = i+1; j < n; j++){
                if(arr[minIdx] > arr[j]){
                    minIdx = j;
                }
            }

            //swap arr[j] with arr[midIdx]
            if(i != minIdx){
                int temp = arr[i];
                arr[i] = arr[minIdx];
                arr[minIdx] = temp;
            }
        }

    }
    
}
