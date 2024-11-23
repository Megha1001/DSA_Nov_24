package searching.searchInSortedRotatedArray;

/*
 *  LOGIC : When the array is sorted and rotated there are some properties with it :
 *      1. One side of the array is always sorted ( corner case : both the sides of the array is sorted)
 *      2. TO decide which half is sorted compare middle element with low or high  to decide whether left or right half is sorted respectively.     
 * 
 *  TIME COMPLEXITY : O(logN)
 * AUXILIARY SPACE : Theta(1)
 */

public class FindElementInSortedRotatedArrayUsingBinarySearch {

    public static void main(String args[]){
        // int [] arr = {100, 500, 10, 20, 30, 40};
        // int x = 500;
        int [] arr = {100, 80, 70, 60, 50, 40};
        int x = 100;
        System.out.println("Element is present in given array at location : "+searchInSortedRotatedArray(arr, arr.length, x));
    }

    public static int searchInSortedRotatedArray(int arr[], int n, int x){
        int low = 0, high = n-1;
        while(low <= high){
            int mid = low + (high-low)/2;

            if(arr[mid] == x){
                return mid;
            }

            //if left half is sorted and element is present there
            if(arr[low] <= arr[mid]){
                if(x >= arr[low] && x < arr[mid]){
                    high = mid - 1; // go to left half
                }else{
                    low = mid + 1; //go to right half
                }
            }
            //if righ half is sorted and element is there
            else {
                if(x > arr[mid] && x <= arr[high]){
                    low = mid + 1; //go to right half
                }else{
                    high = mid - 1; //go to left half
                }
            }

        }
        return -1;


    }
    
}
