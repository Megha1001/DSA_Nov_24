package BitMagic.powerOfTwo;

/*
 * LOGIC : If number is power of 2 that it should have one 1 set bit.
 * Use brain Karningham algo 
 *  -> it will unset the least significant set bit and if after
 *       doing that we get 0 that means it has only one bit as set. 
 *          Hence, the number is power of 2
 * 
 * TIME COMPLEXITY : Theta(1)
 * AUXILIARY SPACE : Theta(1)
 */


public class CheckNumberIsPowerOfTwoUsingBrainKarninghamAlsoMostEfficiently {
    
    public static void main(String args[]){
        int n =256;
        System.out.println("is given number power of 2 ?"+checkPowerOfTwo(n));
    }


    public static boolean checkPowerOfTwo(int n){
        // if(n==0){
        //     return false;
        // }

        // return (n&(n-1)) ==0;

        // return n && ((n&(n-1))==0); // this won't work as java doesn't allow an int to be directly used as boolean
        return n>0 && ((n&(n-1))==0);
    }

}
