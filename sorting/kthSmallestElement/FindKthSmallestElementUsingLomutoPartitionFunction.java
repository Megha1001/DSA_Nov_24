package sorting.kthSmallestElement;


/*
 * Logic : 
 * 1. Partition the array around the pivot.
 * 
 * 2. if p==k-1 return arr[p]
 * else if p > k-1 then high = p-1;
 * else low = p+1
 */
public class FindKthSmallestElementUsingLomutoPartitionFunction {

    public static void main(String args[]){
        int arr[] = {10, 5, 30, 12};
        int k = 1;

        System.out.println("The "+k+"th smallest number in given array is : "+findKthSmallestNumber(arr, 0, arr.length-1, k));
    }


    public static int findKthSmallestNumber(int arr[], int low, int high, int k){

        while(low <= high){
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
