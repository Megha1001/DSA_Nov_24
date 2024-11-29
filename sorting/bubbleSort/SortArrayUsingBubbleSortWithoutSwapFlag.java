package sorting.bubbleSort;
/*
 * Logic :
 * 1. Compare adjacent element.
 *  -> if arr[i] >arr[i+1] -->swap the element
 * 2. After every pass the greatest element in the avaiable array will go to its correct postition
 * 
 * Max Number of Pass required = N-1
 * Max Number of comparision required = N(N-1)/2
 */

public class SortArrayUsingBubbleSortWithoutSwapFlag {

    public static void main(String args[]){
        int arr[] = {2,10,8,7};

        System.out.println("Array after sorting is : ");
        sortUsingBubbleSort(arr, arr.length);
    }

    public static void sortUsingBubbleSort(int arr[], int n){
        
        for(int i=0; i<n-1; i++){

        }

    }
    
}
