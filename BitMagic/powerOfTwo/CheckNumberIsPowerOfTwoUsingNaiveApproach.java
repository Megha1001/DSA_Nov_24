package BitMagic.powerOfTwo;

/* 
 * LOGIC : Divide the number repeatedly by 2 and if at any point we find remainder !=0 return false. handle explicitly 0 case
 * 
 * TIME COMPLEXTIY : O(logN)
 */

public class CheckNumberIsPowerOfTwoUsingNaiveApproach {

    public static void main(String args[]){
        int n =9;
        System.out.println("is the given number power of 2 ? "+checkPowerOfTwo(n));
    }
    

    public static boolean checkPowerOfTwo(int n){

        //handle explicitly for 0
        if(n==0){
            return false;
        }

        while(n!=1){
            if(n%2!=0){
                return false;
            }
            n=n/2;
        }

        return true;
    }

}
