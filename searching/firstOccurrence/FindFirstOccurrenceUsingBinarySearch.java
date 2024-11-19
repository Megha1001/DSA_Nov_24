package searching.firstOccurrence;

/* 
 * LOGIC : Apply binary search just change the logic when the element match
 */

public class FindFirstOccurrenceUsingBinarySearch {

    public static void main(String args[]){
        int arr[] = {5, 10, 10, 15, 20, 20, 20};
        int x = 10;
        System.out.println("The first occurrence of "+x+" in given array is "+findFirstOccurrence(arr, 0, arr.length, x));
    }

    public static int findFirstOccurrence(int arr[], int s, int e, int x){

        //base condition
        if(s > e){
            return -1;
        }

        int mid = s + (e-s)/2;

        if(arr[mid] == x){

            if((mid-1)>=0 && arr[mid-1]==x){
                //this is not the first occurrence
            }

        }

       
    }
    
}
