package BitMagic.checkifKthBitIsSet;

/*
 * Logic : 
 * 1. left shift 1 by k-1 position
 * 2. do bitwise & with n 
 * 3. if result for step 2 > 0 then return true else false
 * 
 * TIME COMPLEXITY : Theta(1)
 * AUXILIARY SPACE : Theta(1)
 */

public class CheckIfKthBitIsSetUsingLeftShiftOperator {
   
    public static void main(String args[]){
        // int n =5, k=1;
        // int n =8, k=2;
        int n =0, k=3;
        System.out.println("is the kth bit of given number is set ? "+checkIfKthBitIsSet(n, k));
    }
    

    public static boolean checkIfKthBitIsSet(int n, int k){
        return ((1<<(k-1)) & n) > 0;
    }

}

