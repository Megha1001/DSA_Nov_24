package searching.findPeakElement;

/*
 * Peak Element : It has some properties
 *  1. Peak should be present where we have greater element in case of mid is not peak
 * 
 * TIME COMPLEXITY : O(logN)
 * AUXILIARY SPACE : Theta(1)
 */

public class FindPeakElementEfficientSolutionUsingBinarySearch {
    public static void main(String args[]){
        int arr[] = {6, 7, 8, 20, 12};
        System.out.println("The peak element in given array is : "+findPeakElement(arr, arr.length));
    }

    public static int findPeakElement(int arr[], int n){
        int low = 0, high= n-1;
        
        while(low <= high){
            int mid = low + (high - low)/2;

            //mid is peak
            if((mid == n-1 || arr[mid] >= arr[mid+1])
                            &&
            (mid == 0 || arr[mid] >= arr[mid-1])){
                return mid;
            }


            if(mid > 0 && arr[mid] <= arr[mid-1]){
                //go to left
                high = mid - 1;
            }else{
                low = mid + 1;
            }


        }

        return -1;

    }
}
