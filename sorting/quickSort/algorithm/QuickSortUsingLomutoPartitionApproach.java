package sorting.quickSort.algorithm;

public class QuickSortUsingLomutoPartitionApproach {
    public static void main(String args[]){
        int arr[] = {8, 4, 7, 9, 3, 10, 5};

        sortArrayUsingQuickSort(arr, 0, arr.length-1);
        System.out.println("Array after sorting the input is : ");

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }

    public static void sortArrayUsingQuickSort(int arr[], int l, int h){

        if(l < h){
            int p = findPartitionUsingLomutoPartitionAlgo(arr, l, h);
            sortArrayUsingQuickSort(arr, l, p-1);
            sortArrayUsingQuickSort(arr, p+1, h);
        }

    }

    public static int findPartitionUsingLomutoPartitionAlgo(int arr[], int l, int h){
        int p = h;
        int i = l-1;

        for(int j = l ; j <= h-1; j++){
            if(arr[j] <= arr[p]){
                ++i;
                //swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j]= temp;
            }
        }

        //swap arr[i+1], and arr[p];
        int temp = arr[i+1];
        arr[i+1] = arr[p];
        arr[p] = temp;

        return i+1;
    }
}
