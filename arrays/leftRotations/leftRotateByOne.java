package arrays.leftRotations;

/*
 * TIME COMPLEXITY : Theta(N)
 * AUXILIARY SPACE : Theta(1)
 */

public class leftRotateByOne {

    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6};
        System.out.println("Array after one rotation is : ");
        leftRotateByOnePlace(arr, arr.length);
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }


    public static void leftRotateByOnePlace(int [] arr, int n){
        if(n==0){
            return;
        }
        int temp = arr[0];
        for(int i=1; i<n;i++){
            arr[i-1] = arr[i];
        }

        arr[n-1] = temp;
        
    }
    
}
