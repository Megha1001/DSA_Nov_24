package BitMagic.countSetBits;

/*
 * LOGIC : To count number of set bits in given number in Theta(1) time  we will use preprocessing
 * 
 * Assumption : number is of 32 bits
 * -> precompute count for 8bits number(0 to 255)
 *  tbl[0]=0
 *  for i=1 to 255
 *      tbl[i] = tbl[i&(i-1)]+1
 * 
 * 
 * TIME COMPLEXITY : Theta(1)
 * AUXILIARY SPACE : Theta(1), we have used array of size 256 which is actually constant ;)
 */

public class CountSetBitsUsingLookUpMostEfficientSolution {

    public static int tbl[] = new int[256];

    //preprocessing
    static{
        tbl[0] = 0;
        for(int i=1; i<256; i++){
            tbl[i] = tbl[i&(i-1)] + 1;
        }
    }

    public static void main(String args[]){
        int input = 7;

        System.out.println("Number of set bits in given number is : "+countSetBits(input));

    }

    public static int countSetBits(int n){

        return tbl[n&255] // check the set bits in last 8 bits
        + tbl[(n>>8)&255] // check the set bits in 8 bits after last 8 bits from last
        +tbl[(n>>16)&255]
        +tbl[n>>24];
    }
    
}
