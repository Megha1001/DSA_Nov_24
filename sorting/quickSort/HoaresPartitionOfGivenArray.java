package sorting.quickSort;

public class HoaresPartitionOfGivenArray {
    public static void main(String args[]){
        int arr[] = {3, 1, 2, 12, 10, 7};

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
                return j;
            }
            //swap
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
