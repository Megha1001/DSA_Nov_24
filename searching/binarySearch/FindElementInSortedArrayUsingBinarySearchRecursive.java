package searching.binarySearch;

/*
 * TIME COMPLEXITY : O(logN)
 * AUXILIARY SPACE : O(logN)
 * 
 * Recursive solution
 */

public class FindElementInSortedArrayUsingBinarySearchRecursive {

    public static void main(String args[]){
        // int arr[] = {1, 2, 3, 4, 5, 6};
        // int x = 2;
        int arr[] = {5, 15, 25};
        int x = 25;

        System.out.println("is the element present at what index in  the given array ? :"+ifPresentGetIndex(arr, 0, arr.length, x));
    }

    public static int ifPresentGetIndex(int arr[], int s, int e, int x){

        if(s > e){
            return -1;
        }

        int mid = s + (e-s)/2;

        if(arr[mid]==x){
            return mid;
        }
        else if(arr[mid] > x){
            //go to left
            return ifPresentGetIndex(arr, s, mid-1, x);
        }
        return ifPresentGetIndex(arr, mid+1, e, x);
    }

           
    
}
