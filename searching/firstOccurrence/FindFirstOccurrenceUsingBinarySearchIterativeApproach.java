package searching.firstOccurrence;


/*
 * TIME COMPLEXITY : O(logN)
 * SPACE COMPLEXITY : Theta(1)
 */

public class FindFirstOccurrenceUsingBinarySearchIterativeApproach {

    public static void main(String args[]){
        int arr[] = {5, 10, 10, 15, 20, 20, 50};
        int x = 50;
        System.out.println("The first occurrence of "+x+" in given array is "+findFirstOccurrence(arr, 0, arr.length-1, x));
    }


    public static int findFirstOccurrence(int arr[], int low , int high, int x){

        while(low <= high){
            int mid = low  + (high-low)/2;

            if(arr[mid] > x){
                //go left 
                high = mid-1;
            }
            else if(arr[mid] < x){
                //go to right
                low = mid+1;
            }
            else if( mid==0 || arr[mid] != arr[mid-1]){
                return mid;
            }else{
                high = mid-1;
            }

        }

        return -1;


    }
    
}
