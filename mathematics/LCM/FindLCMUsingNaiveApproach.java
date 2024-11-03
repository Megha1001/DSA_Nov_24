package mathematics.LCM;

/*
 * LCM : Least Common Multiply, The smallest number which is divisible by both the numbers.
 * Ex : 4, 6 then LCM : 12
 * 
 * TIME COMPLEXITY : O(a*b - max(a,b))
 * AUXILIARY SPACE : Theta(1)
 */

public class FindLCMUsingNaiveApproach {

    public static void main(String args[]){
        int a=4, b=6;
        System.out.println("LCM of two given numbers is "+findLCM(a,b));
    }

    public static int findLCM(int a, int b){
        
        int max = Math.max(a,b);

        for(int i=max; i<=a*b; i++){
            if(i%a==0 && i%b==0){
                break;
            }
            ++max; // we can change max as initialization of i happens only once.
        }
        return max;

    }
    
}
