package searching.searchInSortedRotatedArray;

public class FindElementInSortedRotatedArrayUsingBinarySearch {

    public static void main(String args[]){
        int [] arr = {100, 500, 10, 20, 30, 40};
        int x = 500;
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
                    high = mid - 1;
                }else{
                    low = mid + 1;
                }
            }
            //if righ half is sorted and element is there
            else {
                if(x > arr[mid] && x <= arr[high]){
                    low = mid + 1;
                }else{
                    high = mid - 1;
                }
            }

        }
        return -1;


    }
    
}
