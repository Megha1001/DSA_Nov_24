package arrays.moveZeroesToEnd;

/*
 * LOGIC : Make a temp array with same size as original , and copy non zero values to temp array(rest will already be zero)
 * 
 * TIME COMPLEXITY : Theta(N)
 * AUXILIARY SPACE : Theta(N)
 */

public class MoveZeroesToEndNaiveApproach {
    
    public static void main(String args[]){
        int arr[] = {1,4,2,0,0,8,7,0,3};
        System.out.println("After moving all zeroes to end, arrays is as follows : ");
        moveZeroesToEndAndPrintArray(arr, arr.length);
    }


    public static void moveZeroesToEndAndPrintArray(int arr[], int n){
        int tempArr[] = new int[n];
        int j=0;

        for(int i=0; i<n; i++){
            if(arr[i]!=0){
                tempArr[j] = arr[i];
                ++j;
            }
        }

        //print tempArr
        for(int i=0; i<n;i++){
            System.out.print(tempArr[i]+" ");
        }
    }



}
