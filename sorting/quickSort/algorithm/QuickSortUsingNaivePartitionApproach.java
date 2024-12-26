package sorting.quickSort.algorithm;

public class QuickSortUsingNaivePartitionApproach {

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
            int p = findPartitionUsingNaiveApp(arr, l , h);
            sortArrayUsingQuickSort(arr, l, p-1);
            sortArrayUsingQuickSort(arr, p+1, h);
        }

    }


    public static int findPartitionUsingNaiveApp(int arr[], int l , int h){

        int p = h;
        int temp[] = new int [h-l+1];
        int index = 0;
        int pivotPos = -1;

        for(int i=l; i<h; i++){
            if(arr[i] <= arr[p] && i!=p){
                temp[index++] = arr[i];
            }
        }

        pivotPos = l + index ;
        temp[index++] = arr[p];
        

        for(int i=l; i<h; i++){
            if(arr[i] > arr[p]){
                temp[index++] = arr[i];
            }
        }

        for(int i=l; i<=h; i++){
            arr[i] = temp[i-l];
        }


        return pivotPos;


    }
    
}
