package sorting.MergeSort;

public class MergeTwoArraysGivenLowMidHigh {

    public static void main(String args[]){
        int arr [] = {10,20,40,20,30};
        int low = 0, mid = 2, high = arr.length-1;
        
        System.out.println("After merge function the arrays is : ");
        merge(arr, low, mid, high);

        for(int i = 0; i < high; i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
