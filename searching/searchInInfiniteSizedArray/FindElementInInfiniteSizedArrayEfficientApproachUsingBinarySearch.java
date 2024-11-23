package searching.searchInInfiniteSizedArray;

/*
 * TIME COMPLEXITY : O(log(positition))
 * AUXILIARY SPACE : Theta(1)
 */

public class FindElementInInfiniteSizedArrayEfficientApproachUsingBinarySearch {

    public static void main(String args[]){
        int arr[] = {1,3,5,6,7,9,10,50,64,90};
        int x = 64;
        // int x = 1;
        System.out.println("The element is present at : "+findElement(arr,x));
    }
    

    public static int findElement(int arr[], int x){

        //corner case
        if(arr[0]==x){
            return 0; //since we will be considering i=1 (starting not zero)
        }

        int i = 1;
        while(arr[i] < x){
            i = i*2;
        }//after this there can only be two possibilities , either arr[i] == x, or arr[i] > x
        /*
         * if arr[i]==x , we found the element
         * else --> we found the ending idx until we have to search in the given infinite sized array
         */

        if(arr[i] == x){
            return i;
        }else{
            return binarySearch(arr, i/2+1, i-1, x);
        }
    }

    public static int binarySearch(int arr[], int low , int high, int x){

        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid]==x){
                return mid;
            }
            else if(arr[mid] > x){
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }

        return -1;

    }

}
