package sorting.quickSort;

public class PartitionOfGivenArray {

    public static void main(String args[]){
        int arr[] = {3, 8, 6, 12, 10, 7};

        partitionArrayAroundPivot(arr, arr.length, 5);
        System.out.println("Array after partitioning is : ");
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] +" ");
        }
    }

    public static void partitionArrayAroundPivot(int arr[], int n, int pivot){

        int low = 0;
        int high = pivot-1;

        while(low < high){

            if(arr[low] <= arr[pivot]){
                ++low;
            }

            System.out.println("1low : "+low+ " |high : "+high);

            if(arr[high] > arr[pivot]){
                --high;
            }
            System.out.println("2low : "+low+ " |high : "+high);
            if(arr[high]< arr[pivot] && arr[low] > arr[pivot]){
                //swap high and low
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;

                ++low; --high;
            }

            System.out.println("3low : "+low+ " |high : "+high);

        }
        
        //swap low+1 with pivot
        int temp = arr[low+1];
        arr[low+1] = arr[pivot];
        arr[pivot] = temp;

    }
    
}
