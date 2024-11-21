package searching.lastOccurrence;

public class FindLastOccurrenceUsingBinarySearchRecursiveSolution {
    
    public static void main(String args[]){
        int arr[] = {5, 10, 10, 15, 20, 20, 20};
        int x = 20;
        System.out.println("The last occurrence of "+x+" in given array is "+lastOccurrence(arr, 0, arr.length-1, x));
    }

    public static int lastOccurrence(int arr[], int low, int high , int x){

        if(low > high){
            return -1;
        }

        int mid = low + (high-low)/2;

        if(arr[mid] > x){
            //go left
            lastOccurrence(arr, low , mid-1, x);
        }

        else if (arr[mid] < x){
            lastOccurrence(arr, mid+1, high, x);
        }

        else if(mid==arr.length-1 || arr[mid]!= arr[mid+1]){
            return mid;
        }else{
            return lastOccurrence(arr, mid+1, high, x);
        }

        return -1;

    }


}
