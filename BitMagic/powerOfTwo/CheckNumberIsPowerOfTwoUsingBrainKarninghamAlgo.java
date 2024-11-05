package BitMagic.powerOfTwo;

/*
 * LOGIC : if the number is power of 2 then the set bit will only have 1 set bit
 * 
 * TIME COMPLEXITY : Theta(number of set bits)
 * AUXILIARY SPACE : Theta(1)
 */

public class CheckNumberIsPowerOfTwoUsingBrainKarninghamAlgo {

    public static void main(String args[]){
        int n=64;
        System.out.println("is the given number power of 2 ?"+checkPowerOfTwo(n));
    }

    public static boolean checkPowerOfTwo(int n){
        return countSetBits(n)==1;
    }


    public static int countSetBits(int n){
        int res=0;
        while(n>0){
            n= n&(n-1);
            ++res;
        }
        return res;
    }
    
}
