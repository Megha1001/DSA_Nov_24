package arrays.moveZeroesToEnd;

/*
 * LOGIC : If we have sorted until a(i-1) and if we want to do it in one traversal, and we should be able to decide for a(i) in constant time
 *  -> if a(i) ==0, do nothing
 *  -> a(i)!=0 , then swap with first zero after last nonzero in sorted array
 *      --> Note : for this we have to maintain an extra variable count to keep track on non zero in sorted piece
 * 
 * 
 * TIME COMPLEXITY : Theta(N)
 * AUXILIARY SPACE : Theta(1)

 */

public class MoveZeroesToEndEffApproach {
    

    public static void main(String args[]){
        int arr[] = {1,4,2,0,0,8,7,0,3};
        System.out.println("After moving all zeroes to end, arrays is as follows : ");
        moveZeroesToEndAndPrintArray(arr, arr.length);
    }

    public static void moveZeroesToEndAndPrintArray(int arr[], int n){

    }


}
