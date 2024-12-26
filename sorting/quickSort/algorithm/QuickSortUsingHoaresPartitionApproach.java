package sorting.quickSort.algorithm;

public class QuickSortUsingHoaresPartitionApproach {

    public static void main(String args[]){
        int arr[] = {8, 4, 7, 9, 3, 10, 5};

        sortArrayUsingQuickSort(arr, 0, arr.length-1);
        System.out.println("Array after sorting the input is : ");

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }

    public static void sortArrayUsingQuickSort(int arr[], int l , int h){
        if(l < h){
            int p = findPartitionUsingHoaresPartitionAlgo(arr, l, h);
            sortArrayUsingQuickSort(arr, l, p); // here passing P not p-1
            sortArrayUsingQuickSort(arr, p+1, h);
        }
    }

    public static int findPartitionUsingHoaresPartitionAlgo(int arr[], int l, int h){
        int pivot = arr[l];
        int i = l-1;
        int j = h+1;

        while(true){

            do{
                ++i;
            }while(arr[i] < pivot);

            do{
                --j;
            }while(arr[j] > pivot);

            if(i >= j) return j;

            //swap arr[i] and arr[j]
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

    }

    
}
