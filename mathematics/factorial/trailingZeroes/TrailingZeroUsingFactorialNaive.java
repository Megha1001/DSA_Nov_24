package mathematics.factorial.trailingZeroes;

/*
 * Logic : 
 * 1. Compute the factorial of the given number
 * 2. find trailing zeroes in the factorial
 * 
 * 
 * TIME COMPLEXITY : Theta(N)
 * AUXILIARY SPACE : Theta(1)
 * 
 * PROBLEM with this approach : For slightly greater input it will cause overflow.
 */

public class TrailingZeroUsingFactorialNaive {

    public static void main(String args[]){
        int input = 10;
        System.out.println("Number of trailing zeroes in given number is : "+findTrailingZeroes(input));
    }


    public static int findTrailingZeroes(int n){
        int fact = findFactorial(n);
        int res = 0;

        while(fact%10==0){
            ++res;
            fact /= 10;
        }

        return res;

    }


    public static int findFactorial(int n){
        int fact = 1;
        for(int i=2; i<=n; i++){
            fact *= i;
        }

        return fact;
    }
    
}
