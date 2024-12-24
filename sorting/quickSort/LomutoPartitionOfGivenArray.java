package sorting.quickSort;

public class LomutoPartitionOfGivenArray {

    public static void main(String args[]){
        int arr[] = {3, 8, 6, 12, 10, 7};

        partitionArrayAroundPivot(arr, 0 ,arr.length-1, 5);
        System.out.println("Array after partitioning is : ");
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] +" ");
        }
    }

    
}
