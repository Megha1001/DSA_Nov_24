package arrays.leftRotations.leftRotationsByD;


/*
 * LOGIC : Call leftRotate by 1 d times
 * 
 * TIME COMPLEXITY : Theta(nd)
 * AUXILIARY SPACE : Theta(1)
 */

public class LeftRotateByDNaiveApproach {

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
        int count=0;
        while(count!=d){
            rotateByOnePlace(arr, n);
            ++count;
        }
    }

    public static void rotateByOnePlace(int arr[], int n){
        int temp=arr[0];
        for(int i=1;  i<n; i++){
            arr[i-1] = arr[i];
        }

        arr[n-1] = temp;
    }
    
}
