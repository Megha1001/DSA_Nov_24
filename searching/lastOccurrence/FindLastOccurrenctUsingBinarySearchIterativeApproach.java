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
                low = mid+1;
            }
            else if(arr[mid] < x){
                //right
                high = mid -1;
            }
            else if(mid == arr.length-1 || arr[mid]!=arr[mid+1]){
                return mid;
            }else{
                low = mid+1;
            }

        }
        return -1;

    }
    
}
