package arrays.removeDuplicateFromSortedArray;

public class RemoveDuplicatesFromSortedArrayEfficientApproach {

    public static void main(String args[]){
        int arr[] = {1,4,5,6,7,7,7,8,8,8,9,10};
        System.out.println("Array after removing duplicates is : ");
        int uniqueElements = removeDuplicates(arr, arr.length);
        for(int i=0; i<uniqueElements; i++){
            System.out.print(arr[i]+" ");
        }
    }


    public static int removeDuplicates(int arr[], int n){

        int idx = 1;
        for(int i=1; i<n; i++){
            if(arr[i]!=arr[idx-1]){
                arr[idx] = arr[i];
                ++idx;
            }
        }

        return idx;

    }

    
}
