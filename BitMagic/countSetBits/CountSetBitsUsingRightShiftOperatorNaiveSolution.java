package BitMagic.countSetBits;

/*
 * LOGIC : 
 * 1. do the bitwise & with last digit of number and 1 then shift number to right by 1 using right shift operator
 * 
 * TIME COMPLEXITY : Theta(length(n))
 * AUXILIARY SPACE : Theta(1)
 */

public class CountSetBitsUsingRightShiftOperatorNaiveSolution {

    public static void main(String args[]){
        int n=13;
        System.out.println("The number of set bits in given number is : "+countSetBits(n));
    }

    public static int countSetBits(int n){
        int res = 0;

        while(n!=0){
            if((n&1)!=0){ //if(n%2==1) //odd, last bit is set
                ++res;
            }
            n = n>>1; //signed right shift OR n=n/2
        }

        return res;
    }
    
}
