package sorting.bubbleSort;
/*
 * Logic :
 * 1. Compare adjacent element.
 *  -> if arr[i] >arr[i+1] -->swap the element
 * 2. After every pass the greatest element in the avaiable array will go to its correct postition
 * 
 * Max Number of Pass required = N-1
 * Max Number of comparision required = N(N-1)/2
 *
 * 
 * Note : Here we are using swap flag so just in case array is sorted we dont need to compare or run other passes
 * TIME COMPLEXITY : O(N^2)
 * AUXILIARY SPACE : O(1)
 */

public class SortArrayUsingBubbleSortWithSwapFlag {

    public static void main(String args[]){
        int arr[] = {2,10,8,7};

        System.out.println("Array after sorting is : ");
        sortUsingBubbleSort(arr, arr.length);

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }

    public static void sortUsingBubbleSort(int arr[], int n){
        
        for(int i=0; i<n-1; i++){ //n-1 swaps
            for(int j=0; j < n-1-i; j++){ // -i , since after every pass 
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }

    }
    
}
