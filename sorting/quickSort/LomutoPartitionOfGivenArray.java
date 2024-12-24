package sorting.quickSort;

/*
 * TIME COMPLEXITY : O(N)
 * AUXILIARY SPACE : Theta(1)
 */

public class LomutoPartitionOfGivenArray {

    public static void main(String args[]){
        int arr[] = {3, 8, 6, 12, 10, 7};

        partitionArrayAroundPivot(arr, 0 ,arr.length-1, 5);
        System.out.println("Array after partitioning is : ");
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] +" ");
        }
    }


    public static int partitionArrayAroundPivot(int arr[], int low, int high, int pivot){

        int i = low-1;

        for(int j=low; j<=high; j++){
            if(arr[j] < arr[pivot]){
                ++i;
                //swap i and j
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        //swap i+1 and pivot
        int temp = arr[pivot];
        arr[pivot] = arr[i+1];
        arr[i+1] = temp;

        return i+1 ; //index of pivot

    }

    
}
