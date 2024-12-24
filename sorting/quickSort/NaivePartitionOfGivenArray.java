package sorting.quickSort;

/*
 * Naive approach : 
 * 1. Declare a temp array with size h-l+1; and index;
 * 2. copy all the elements that are <= arr[pivot] && not pivot to temp array
 * 3. copy the arr[pivot]
 * 4. copy all the elements that are > arr[pivot] to temp array
 * 5. copy all the elements of temp array to original array
 * 
 * 
 * TIME COMPLEXITY : Theta(N)
 * AUXILIARY SPACE : Theta(N)
 */

public class NaivePartitionOfGivenArray {

    public static void main(String args[]){
        int arr[] = {3, 8, 6, 12, 10, 7};

        partitionArrayAroundPivot(arr, 0 ,arr.length-1, 5);
        System.out.println("Array after partitioning is : ");
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] +" ");
        }
    }

    public static void partitionArrayAroundPivot(int arr[], int l, int h, int pivot){

        int temp[] = new int[h-l+1];
        int index = 0;

        for(int i=l; i<=h; i++){
            if(arr[i] <= arr[pivot] && i!=pivot){ //inplace
                temp[index++] = arr[i];
            }
        }

        temp[index++] = arr[pivot];

        for(int i=l; i<=h; i++){
            if(arr[i] > arr[pivot]){
                temp[index++] = arr[i];
            }
        }


        for(int i = l; i <= h; i++){
            arr[i] = temp[i-l]; // temp index starts from 0
        }


    }
    
}
