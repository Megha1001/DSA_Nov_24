package searching.binarySearch;

public class FindElementInSortedArrayUsingBinarySearchIterative {

    public static void main(String args[]){
        int arr[] = {1, 2, 3, 4, 5, 6};
        int x = 2;

        System.out.println("is the element present at what index in  the given array ? :"+isPresent(arr, arr.length, x));
    }

    public static int isPresent(int arr[], int n, int x){
        
        int s = 0;
        int e = n-1;

        while(s <= e){
            int mid = s+ (e-s)/2; //to secure from overflow

            System.out.println("mid : "+mid);
            if(arr[mid] == x){
                return mid;
            }
            else if(arr[mid] > x){
                // x would be locating at left
                e = mid-1;
            }else{
                s = mid+1;
            }
        
        }
        return -1;
    }
    
}
