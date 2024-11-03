package mathematics.factorial.trailingZeroes;


/*
 * Logic : Naive approach that we have will result in overflow for slightly greater input. This solution will use the idea to find the (2,5) pairs in prime factorization of the given number. Number of 5 will be less than number of 2's
 * 
 * 
 * TIME COMPLEXITY : Theta(logN , base 5)
 * AUXILIARY SPACE : Theta(1)
 */

public class TrailingZeroesUsingPrimeFactorizationLogic {


    public static void main(String args[]){
        int input = 127;
        System.out.println("Number of trailing zeroes in given number is : "+findTrailingZeroes(input));
    }

    public static int findTrailingZeroes(int n){

        int res = 0;
        for(int i=5; i<=n; i=i*5){
            res += n/i;
        }

        return res;

    }

    
}
