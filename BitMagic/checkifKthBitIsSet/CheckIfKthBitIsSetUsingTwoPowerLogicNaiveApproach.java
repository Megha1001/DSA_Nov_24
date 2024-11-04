package BitMagic.checkifKthBitIsSet;

/*
 * Logic : 
 * 1. If we do bitwise & with 2^k-1 and if that result !=0 then kth bit is set otherwise not set.
 * 
 * TIME COMPLEXITY : Theta(K)
 * AUXILIARY SPACE : Theta(1)
 * 
 * It's basically a left shift operator thing( when we do left shift we multiply the number by 2)
 */

public class CheckIfKthBitIsSetUsingTwoPowerLogicNaiveApproach {
   
    public static void main(String args[]){
        int n =5, k=1;
        // int n =8, k=2;
        // int n =0, k=3;
        System.out.println("is the kth bit of given number is set ? "+checkIfKthBitIsSet(n, k));
    }
    

    public static boolean checkIfKthBitIsSet(int n, int k){
       int x = 1;

       for(int i=0; i<(k-1); i++){
            x = x*2;
       }

       return (n&x)!=0;

    }

}
