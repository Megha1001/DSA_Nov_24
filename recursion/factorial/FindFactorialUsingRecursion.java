package recursion.factorial;

/*
 * LOGIC : Using tail recursion / tail call elimination
 * 
 * TIME COMPLEXITY : O(N)
 * AUXILIARY SPACE : Theta(1)
 */

public class FindFactorialUsingRecursion {

    public static void main(String args[]){
        int number = 5;
        System.out.println("Factorial of the given number using recursion is : "+findFac(number, 1));
    }

    public static int findFac(int n, int k){

        if(n==0||n==1){
            return k;
        }

        return findFac(n-1, k*n);
        
    }
    
}
