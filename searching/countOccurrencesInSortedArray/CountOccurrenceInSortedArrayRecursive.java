package searching.countOccurrencesInSortedArray;

public class CountOccurrenceInSortedArrayRecursive {
    
    public static void main(String args[]){
        int arr[] = {10,20,20,20,30,50};
        int x = 20;
        System.out.println("The occurrence of "+x+ " is "+countOccurrence(arr, 0, arr.length-1, x));
    }


    public static int countOccurrence(int arr[], int low, int high, int x){
        
        if(low > high){
            return 0;
        }

        int mid = low + (high-low)/2;
        if(arr[mid]==x){
            // 1 + count occurence in left  + count occurence in right
            return 1 + countOccurrence(arr, low, mid-1, x) + countOccurrence(arr, mid+1 , high, x);
        }
        else if(arr[mid] > x){
            return countOccurrence(arr, low, mid-1, x);
        }else{
            return countOccurrence(arr, mid+1, high, x);
        }
    }
    
}
