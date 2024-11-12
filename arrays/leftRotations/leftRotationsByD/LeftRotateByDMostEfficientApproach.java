package arrays.leftRotations.leftRotationsByD;

/*
 * LOGIC
 *  -reverse(arr, 0,d-1)
 *  -reverse(arr, d, n-1)
 *  -reverse(arr, 0, n-1)
 */

public class LeftRotateByDMostEfficientApproach {

    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6};
        int d=3;
        System.out.println("Array after "+d+" rotation is : ");
        rotateArrayByDPosition(arr, arr.length, d);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void rotateArrayByDPosition(int arr[], int n, int d){
        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0, n-1);
    }
    

    public static void reverse(int arr[], int low, int high){
        while(low<high){
            //swap
            int temp = arr[low];
            arr[low]=arr[high];
            arr[high] = temp;
            ++low;
            --high;
        }
    }

}
