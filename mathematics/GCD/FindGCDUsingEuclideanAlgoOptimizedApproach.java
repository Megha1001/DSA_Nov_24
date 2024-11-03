package mathematics.GCD;

/*
 * TIME COMPLEXITY : O(log(min(a,b)))
 * AUXILIARY SPACE : Theta(1)
 */

public class FindGCDUsingEuclideanAlgoOptimizedApproach {

    public static void main(String args[]){
        int a = 12, b=15;
        System.out.println("GCD of given numbers is : "+findGcd(a, b));
    }


    public static int findGCD(int a, int b){
        if(b==0){
            return a;
        }

        return findGCD(b, a%b);
    }
    
}
