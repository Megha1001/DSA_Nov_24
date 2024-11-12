package arrays.leftRotations.leftRotationsByD;

/*
 * TIME COMPLEXITY : Theta(N)
 * AUXILIARY SPACE : Theta(d)
 */

public class LeftRotateByDEfficient2Approach {


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

        int temp[] = new int[d];

        for(int i=0; i<d; i++){
            temp[i]=arr[i];
        }

        for(int i=d; i<n; i++){
            arr[i-d] = arr[i];
        }

        for(int i=0; i<d; i++){
            arr[n-d+i] = temp[i];
        }


    }

    
}
