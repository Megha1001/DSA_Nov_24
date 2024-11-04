package BitMagic.countSetBits;

/*
 * LOGIC : 
 * 1. do the bitwise & with last digit of number and 1 then shift number to right by 1 using right shift operator
 * 
 * TIME COMPLEXITY : Theta(length(n))
 * AUXILIARY SPACE : Theta(1)
 * 
 * CONS : IT will run for number of bits from last to MSB. There exist an algorithm that run number of set bit times (Brain and Kerningham algorithm)
 */

public class CountSetBitsUsingRightShiftOperatorNaiveSolution {

    public static void main(String args[]){
        int n=13;
        System.out.println("The number of set bits in given number is : "+countSetBits(n));
    }

    public static int countSetBits(int n){
        int res = 0;

        while(n!=0){
            // if((n&1)!=0){ //if(n%2==1) //odd, last bit is set
            //     ++res;
            // }

            res = res+ (n&1);
            n = n>>1; //signed right shift OR n=n/2
        }

        return res;
    }
    
}
