package searching.countOnesInSortedArray;

public class CountOnesInSortedArrayUsingBinarySearch {

    public static void main(String args[]){
        int arr[] = {0,1,1,1,1,1};
        System.out.println("The number of 1's in given array is  : "+countOnes(arr, 0, arr.length-1));
    }


    public static int countOnes(int arr[], int low, int high){

        if(low > high){
            return 0;
        }

        int mid = low + (high-low)/2;

        if(arr[mid]==1){
            return 1+ (high-mid) + countOnes(arr, low, mid-1); //1 + 1's on right side + count on left side
        }else{ // arr[mid]==0 //search on right side
            return  countOnes(arr, mid+1, high);
        }

    }
    
}
