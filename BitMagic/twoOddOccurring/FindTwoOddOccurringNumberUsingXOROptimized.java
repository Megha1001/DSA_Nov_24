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
 * TIME COMPLEXITY : Theta(N)
 * AUXILIARY SPACE : Theta(1)
 * 
 */

public class FindTwoOddOccurringNumberUsingXOROptimized {

    public static void main(String args[]){
        int arr[] = {1,6,5,6,6,1};
        System.out.println(" The two times odd occurring numbers in given data are : ");
        int res[] = findTwoOddOccurringNumber(arr);
        System.out.print(res[0]+","+res[1]);
    }

    public static int[] findTwoOddOccurringNumber(int []arr){
        int res[] = new int[2];
        int len = arr.length;

        //Step1 : To find XOR of given numbers
        int xorNum = arr[0];
        for(int i=1; i<len; i++){
            xorNum ^= arr[i];
        }

        //Step2 : find set bit
        int setBit = xorNum & (~(xorNum-1)); // It will be having only 1 set bit which is the least set bit in xorNum

        for(int i=0; i<len; i++){
            if(((arr[i])& setBit)>0){
                res[0] ^= arr[i];
            }else{
                res[1]^= arr[i];
            }
        }

        return res;
    }
    
}
