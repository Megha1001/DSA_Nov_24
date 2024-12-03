package sorting.MergeSort;

public class SortArrayUsingMergeSortAlgo {

    public static void main(String args[]){
        int arr[] = {4, 0, 9, 1, 2, 3, 3, 4, 2, 19};
        System.out.println("Array after sorting using merge sort is ");
        int left  = 0, right = arr.length - 1;
        mergeSort(arr, left, right);

        for(int i = left; i <= right; i++){
            System.out.print(arr[i] + " ");
        }
    }


    public static void mergeSort(int arr[], int l, int r){

        if(r > l){
            int m = l + (r - l)/2;

            mergeSort(arr, l, m);
            mergeSort(arr, m+1, r);
            merge(arr, l , m, r);

        }

    }

    public static void merge(int arr[], int l, int m, int r){

        int n1 = m - l + 1;
        int n2 = r - m;

        int left [] = new int[n1];
        int right [] = new int[n2];

        for(int i = 0; i < n1; i++){
            left[i] = arr[l + i];
        }

        for(int i = 0; i < n2; i++){
            right[i] = arr[m + 1 + i];
        }

        int idx1 = 0; 
        int idx2 = 0;
        int idx = l;

        while(idx1 < n1 && idx2 < n2){

            if(left[idx1] <= right[idx2]){
                arr[idx++] = left[idx1++];
            }else{
                arr[idx++] = right[idx2++];
            }

        }

        while(idx1 < n1){
            arr[idx++] = left[idx1++];
        }

        while(idx2 < n2){
            arr[idx++] = right[idx2++];
        }


    }
    
}
