package arrays.removeDuplicateFromSortedArray;

import java.util.ArrayList;

/

public class RemoveDuplicatedFromSortedArrayNaiveApproarch {

    public static void main(String args[]){
        int arr[] = {1,4,5,6,7,7,7,8,8,8,9,10};
        System.out.println("Array after removing duplicates is : ");
        removeDuplicates(arr, arr.length);
    }

    public static void removeDuplicates(int arr[], int n){
        ArrayList<Integer> result = new ArrayList<>(n);
        result.add(arr[0]);

        int curr = arr[0];
        
        for(int i=1; i<n-1; i++){
            if(curr==arr[i]){
                continue;
            }
            result.add(arr[i]);
            curr = arr[i];
        }

        //print the result
        result.stream().forEach(System.out::println);

    }
    
}
