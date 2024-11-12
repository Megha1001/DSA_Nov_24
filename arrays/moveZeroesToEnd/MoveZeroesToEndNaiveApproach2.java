package arrays.moveZeroesToEnd;

/*
 * LOGIC : Traverse array from left to right , once you find 0 at i, traverse from i+1 and find nonzero and swap
 * 
 * TIME COMPLEXITY : Theta(N^2)
 * AUXILIARY SPACE : Theta(1)
 */

public class MoveZeroesToEndNaiveApproach2 {
    
    public static void main(String args[]){
        int arr[] = {1,4,2,0,0,8,7,0,3};
        System.out.println("After moving all zeroes to end, arrays is as follows : ");
        moveZeroesToEndAndPrintArray(arr, arr.length);
    }


    public static void moveZeroesToEndAndPrintArray(int arr[], int n){
        
        for(int i=0; i<n;i++){
            if(arr[i]==0){
                for(int j=i+1; j<n; j++){
                    if(arr[j]!=0){
                        //swap
                        int temp = arr[j];
                        arr[j] = arr[i];
                        arr[i]= temp;
                    }
                }
            }
        }

        //print tempArr
        for(int i=0; i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }



}
