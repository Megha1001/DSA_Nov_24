package sorting.kthSmallestElement;


/*
 * Logic : 
 * 1. Partition the array around the pivot.
 * 
 * 2. if p==k-1 return arr[p]
 * else if p > k-1 then high = p-1;
 * else low = p+1
 * 
 * This is QuickSelect Algorithm
 * 
 * Quickselect algorithm is used to find the k-th smallest in an unsorted array without fully sorting it.
 * 
 * It works by partitioning the array around a pivot, ensuring :
 *  - Elements smaller than the pivot are on the left
 *  - Elements larger than the pivot are on the right.
 * 
 * The partition containing the k-th smallest elements is partially sorted :
 *  - Elements on the left of the k-th smallest are smaller
 *  - Elements on the right are larger
 * 
 * Only the necessary part of the array is processed, making it faster than full sorting for this purpose
 * 
 * key Note : The rest of the array(outside the partition) remains unsorted
 */
public class FindKthSmallestElementUsingLomutoPartitionFunction {

    public static void main(String args[]){
        int arr[] = {6, 7, 4, 2, 0, 19, 17, 18};
        int k = 8;

        System.out.println("The "+k+"th smallest number in given array is : "+findKthSmallestNumber(arr, 0, arr.length-1, k));

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }


    public static int findKthSmallestNumber(int arr[], int low, int high, int k){

        while(low <= high){ // = should be there
            int p = partition(arr, low, high);

            if(p==k-1){
                return arr[p];
            }
    
            else if(p > k-1){
                high = p-1;
            }
            
            else{
                low = p+1;
            }
    
        }
        

        return -1;

    }


    public static int partition(int arr[], int low, int high){
        int pivot = high;
        int i = low-1;

        for(int j=low; j<high; j++){
            if(arr[j] < arr[pivot]){
                ++i;
                //swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //swap pivot and i+1;
        int temp = arr[pivot];
        arr[pivot] = arr[i+1];
        arr[i+1] = temp;

        return i+1;

    }
    
}
