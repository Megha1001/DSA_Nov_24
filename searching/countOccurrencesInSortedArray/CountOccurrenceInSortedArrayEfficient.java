package searching.countOccurrencesInSortedArray;

/*
 * LOGIC  : last occurence - firstOccurrence + 1;
 * 
 * TIME COMPLEXITY : O(logN)
 * AUXILIARY SPACE : Theta(1)
 */

public class CountOccurrenceInSortedArrayEfficient {
    public static void main(String args[]){
        int arr[] = {10,20,20,20,30,50};
        int x = 20;
        System.out.println("The occurrence of "+x+ " is "+countOccurrence(arr, 0, arr.length-1, x));
    }

    public static int countOccurrence(int arr[], int low, int high, int x){

        int firstOccurrence = findFirstOccurrence(arr, low, high, x);
        if(firstOccurrence==-1){
            return -1;
        }
        int lastOccurrence = findLastOccurrence(arr, low, high, x);

        return lastOccurrence - firstOccurrence + 1;
    }

    public static int findFirstOccurrence(int arr[], int low , int high , int x){
        while(low <= high){
            int mid = low + (high-low)/2;

            if(arr[mid] > x){
                //left
                high = mid-1;
            }else if(arr[mid] < x){
                low = mid+1;
            }
            else if(mid==0 || arr[mid]!= arr[mid-1]){
                return mid;
            }else{
                high = mid-1;
            }

        }

        return -1;
    }

    public static int findLastOccurrence(int arr[], int low , int high, int x){

        while(low <= high){
            int mid = low + (high-low)/2;

            if(arr[mid] > x){
                high = mid-1;
            }else if(arr[mid] < x){
                low = mid+1;
            }else if(mid == arr.length-1 || arr[mid]!= arr[mid+1]){
                return mid;
            }else{
                low = mid+1;
            }
        }
        
        return -1;

    }
}
