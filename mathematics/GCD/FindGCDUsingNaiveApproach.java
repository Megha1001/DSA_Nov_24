package mathematics.GCD;

/*
 * GCD stands for greatest common divisor, basically it is the largest number that divides both the number.
 * IF GCD is 1 that doesn't mean number are prime. they can be composite like 9,10
 * 
 * TIME COMPLEXITY : Theta(min(a,b))
 * AUXILIART SPACE: Theta(1)
 *
 */

public class FindGCDUsingNaiveApproach {
    
    public static void main(String args[]){
        int a = 9, b = 10;
        System.out.println("GCD of given numbers is "+findGCD(a, b));
    }

    public static int findGCD(int a, int b){
        int res = Math.min(a,b);

        while(res != 0){
            if(a%res==0 && b%res==0){
                break;
            }
            --res;
        }

        return res;

    }

}
