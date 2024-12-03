package sorting.MergeSort;

/*
 * TIME COMPLEXITY : O(N)
 * AUXILIARY SPACE : O(N)
 */

public class MergeTwoArraysGivenLowMidHigh {

    public static void main(String args[]){
        int arr [] = {10,20,40,20,30};
        int low = 0, mid = 2, high = arr.length-1;
        
        System.out.println("After merge function the arrays is : ");
        merge(arr, low, mid, high);

        for(int i = 0; i <= high; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void merge(int arr[], int low, int mid, int high){

        int n1 = mid - low + 1;
        int n2 = high - mid;

        int left[] = new int[n1], right[] = new int[n2];

        for(int i = 0; i < n1; i++){
            left[i] = arr[low + i];
        }

        for(int i = 0; i < n2; i++){
            right[i] = arr[mid + 1 + i];
        }

        int idx1 = 0; // to point to n1
        int idx2 = 0; // to point to n2
        int idx = low; // to point to actual array

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
