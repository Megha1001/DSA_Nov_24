package BitMagic.checkifKthBitIsSet;

/*
 * Logic : 
 * 1. Right shift given number by k-1 position
 * 2. do bitwise & with 1 
 * 3. if result for step 2 > 0 then return true else false
 * 
 * TIME COMPLEXITY : Theta(1)
 * AUXILIARY SPACE : Theta(1)
 */

public class CheckIfKthBitIsSetUsingRightShiftOperator {
   
    public static void main(String args[]){
        int n =5, k=1;
        // int n =8, k=2;
        // int n =0, k=3;
        System.out.println("is the kth bit of given number is set ? "+checkIfKthBitIsSet(n, k));
    }
    

    public static boolean checkIfKthBitIsSet(int n, int k){
        return ((n>>(k-1)) & 1) !=0;
    }

}
