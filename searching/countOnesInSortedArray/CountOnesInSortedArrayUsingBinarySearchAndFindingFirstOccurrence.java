package searching.countOnesInSortedArray;
/*
 * LOGIC : If I find first occurrence of 1 and subtract it from total number of elements it will give me number of 1 present in the array.
 */

public class CountOnesInSortedArrayUsingBinarySearchAndFindingFirstOccurrence {
    

    public static void main(String args[]){
        // int arr[] = {0,1,1,1,1,1};
        // int arr[] = {0,0,0,0,1,1};
        // int arr[] = {0,0,0,0,0,0};
        // int arr[] = {0,0,0,0,0,1};
        int arr[] = {1,1,1,1,1,1};
        System.out.println("The number of 1's in given array is  : "+countOnes(arr, 0, arr.length-1, 1));
    }

    public static int countOnes(int arr[], int low, int high, int x){
        
    }

}
