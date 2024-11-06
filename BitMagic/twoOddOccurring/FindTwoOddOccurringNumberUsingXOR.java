package BitMagic.twoOddOccurring;
/*
 * LOGIC : 
 * input : [5,6,10,6,10,6,3,3]
 * 1. Find XOR of all the numbers -> 5^6^10^6^10^6^3^3 = 5^6 = 3
 * where we found the set bit means that bit is having different values in found numbers (ans - 5, 6) and where the bit is unset(i.e. 0) that means that bit is same in 
 * two odd occurring number
 * 
 * 2. divide the given numbers in two groups (find the set bit in xor number and divide it on the basis of that number)
 *  - 5,3,3
 *  - 6,10,6,10,6
 * 
 * 3. Do xor of these two groups
 * 
 */

public class FindTwoOddOccurringNumberUsingXOR {

    public static void main(String args[]){
        int arr[] = {5,6,10,6,10,6,3,3};
        System.out.println(" The two times odd occurring numbers in given data are : ");
        int res[] = findTwoOddOccurringNumber(arr);
        System.out.print(res[0]+","+res[1]);
    }


    public static int[] findTwoOddOccurringNumber(int [] arr){

        int res[] = new int[2];
        int len = arr.length;

        //find xor of given number
        int xor = arr[0];
        for(int i=1; i<len; i++){
            xor ^= arr[i];
        }

        //find SetBit in XORed number
        int setBit = findSetBitInXoredNum(xor); // setbit finding is done on zero index basis

        //divide into two group
        int firstGrp [] = new int[len];
        int idx1=0;
        int secondGrp [] = new int[len];
        int idx2=0;

        for(int i=0; i<len; i++){
            //bit is set
            if(((1<<(setBit))& arr[i])> 0){
                firstGrp[idx1] = arr[i];
                ++idx1;
            }else{
                secondGrp[idx2] = arr[i];
                ++idx2; 
            }
        }
        
        //XORed the items in two groups seperately
        res[0] = firstGrp[0];
        res[1] = secondGrp[0];

        for(int i=1; i<len; i++){
            res[0] ^= firstGrp[i];
            res[1] ^= secondGrp[i];
        }

        return res;

    }

    public static int findSetBitInXoredNum(int xor){
        //assumption 32 bit number
        for(int i=0 ;i<31;i++){
            if(((1<<i)&xor) >0){
                return i;
            }
        }
        return -1;
    }
    
}
