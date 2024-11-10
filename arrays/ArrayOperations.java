package arrays;

import java.util.Arrays;

public class ArrayOperations {
    
    public static void main(String args[]){
        
        //Searching
        int arr[] = {3,4,6,2,0,9};
        System.out.println("Search element is present at ? "+searchElement(arr, 4));


        //Insertion
        int arr1[] = new int[10];
        //insertion
        for(int i=0; i<arr1.length-2; i++){ //fill until index 7
            arr1[i] =i;
        }

       for(int i=0; i<arr1.length;i++){
            System.out.print(arr1[i]+",");
       }

        int x = 98;
        int pos = 7;
        int cap = 8;

        System.out.println("\nInsert "+x+" at position "+pos);
        int newCapacity = insert(arr1, arr1.length, x, pos, cap);

        for(int i=0; i<newCapacity;i++){
            System.out.print(arr1[i]+",");
       }
    }

    //search operation
    public static int searchElement(int []arr, int search){

        for(int i=0; i<arr.length;i++){
            if(arr[i]==search){
                return i+1;
            }
        }

        return -1; //not found
    }

    public static int insert(int[] arr, int len, int toInsert, int pos, int cap){

        if(len==cap){
            return len;
        }

        //wild insert where we have an empty/non occupied place
        if(arr[pos-1]==0){
            arr[pos-1] = toInsert;
            return cap+1;
        }

        for(int i=len-2; i>=pos-1; i--){
            arr[i+1] =arr[i];
        }

        arr[pos-1] = toInsert;

        return cap+1;

    }


}
