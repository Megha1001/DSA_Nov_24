package sorting.quickSort;

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
