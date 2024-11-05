package BitMagic.powerOfTwo;

/*
 * LOGIC : If number is power of 2 then only 1  bit is set
 * Here will use lookup method that will takes Theta(1) Time complexity.
 * 
 * 
 * TIME COMPLEXITY : Theta(1)
 * AUXILIARY SPACE : Theta(1), we have used only 256 int which is constant ;)
 */

public class CheckNumberIsPowerOfTwoUsingCountSetBitConceptEfficientApproach {

    //assumption - number is 32 bits
    public static int tbl[]= new int[256];

    static{
        tbl[0]=0;
        for(int i=1;i<256;i++){
            tbl[i] = tbl[i&(i-1)]+1;
        }
    }

    public static void main(String args[]){
        int n=16;
        System.out.println("is the given number power of 2 ? "+checkPowerOfTwo(n));
    }


    public static boolean checkPowerOfTwo(int n){
        return countSetBits(n)==1;
    }

    public static int countSetBits(int n){
        return tbl[n&255]+
        tbl[(n>>8)&255]+
        tbl[(n>>16)&255]+
        tbl[n>>24];
    }
    
}
