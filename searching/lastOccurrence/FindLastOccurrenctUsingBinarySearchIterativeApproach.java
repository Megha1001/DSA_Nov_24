package searching.lastOccurrence;

public class FindLastOccurrenctUsingBinarySearchIterativeApproach {

    public static void main(String args[]){
        int arr[] = {5, 10, 10, 15, 20, 20, 20};
        int x = 20;
        System.out.println("The last occurrence of "+x+" in given array is "+lastOccurrence(arr, 0, arr.length-1, x));
    }


    public static int lastOccurrence(int arr[], int low, int high, int x){

        while(low <= high){
            int mid = low + (high-low)/2;

            if(arr[mid] > x){
                //left
                return lastOccurrence(arr, low, mid-1, x);
            }
            else if(arr[mid] < x){
                //right
                return lastOccurrence(arr, mid+1, high, x);
            }
            else if(mid == arr.length-1 || arr[mid]!=arr[mid+1]){
                return mid;
            }else{
                return lastOccurrence(arr, mid+1, high, x);
            }

        }
        return -1;

    }
    
}
