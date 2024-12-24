package sorting.quickSort;


/*
 * TIME COMPLEXITY : O(N)
 * AUXILIARY SPACE : O(1)
 * 
 * Pivot : first element
 * 
 * Interesting fact : The element that we decide as pivot. it won't partition around that element instead it will return the index of element around which
 * partition has been done.
 */

public class HoaresPartitionOfGivenArray {
    public static void main(String args[]){
        int arr[] = {5, 3, 8, 4, 2, 7, 1, 10};

        partitionArrayAroundPivot(arr, 0 ,arr.length-1);
        System.out.println("Array after partitioning is : ");
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] +" ");
        }
    }


    public static int partitionArrayAroundPivot(int arr[], int low, int high){

        int pivot = arr[low];

        int i = low-1;
        int j = high+1;

        while(true){
            do{
                ++i;
            }while(arr[i] < pivot);

            do{
                --j;
            }while(arr[j] > pivot);
            
            if(i>=j){
                return j; // this would be pivot
            }
            //swap
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
