package BitMagic.countSetBits;

/*
 * LOGIC : 
 * 1. count only the set bits using Brain and Kerningham algorithm
 */

public class CountSetBitsUsingRightShiftOperatorBrainAndKerninghamAlgoEfficientApproach {

    public static void main(String args[]){
        int n=13;
        System.out.println("The number of set bits in given number is : "+countSetBits(n));
    }

    public static int countSetBits(int n){
        int res = 0;

        while(n>0){
            n = n & (n-1) ;// This expression will make the last set bit as 0;
            ++res;
        }

        return res;
    }
    
}
