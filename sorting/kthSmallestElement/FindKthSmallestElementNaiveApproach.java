package sorting.kthSmallestElement;

/*
 * Logic 
 * 1. sort the array using selectionSort
 * 2. 
 */

public class FindKthSmallestElementNaiveApproach {

    public static void main(String args[]){
        int arr[] = {10, 5, 30, 12};
        int k = 0;

        System.out.println("The "+k+"th smallest number in given array is : "+findKthSmallestNumber(arr, k));
    }


    public static int findKthSmallestNumber(int arr[], int k){

        for(int i=0; i<k; i++){
            int minIdx = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[minIdx] > arr[j]){
                    minIdx = j;
                }
            }

            if(minIdx != i){
                //swap
                int temp = arr[minIdx];
                arr[minIdx] = arr[i];
                arr[i] = temp;
            }
        }

        for(int i=0; i< arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        

        return arr[k];
    }
    
}
