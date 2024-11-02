package mathematics.factorial;

/*
 * TIME COMPLEXITY : Theta(N)
 * AUXILIARY SPACE : Theta(1)
 */

public class FindFactorialIterative {

    public static void main(String args[]){
        int input = 7;
        System.out.println("The factorial of input "+input+" is : "+findFactorial(input));
    }

    public static int findFactorial(int n){

        int res = 1;

        if(n==0 || n==1){
            return res;
        }

        for(int i=2; i<=n; i++){
            res *= i;
        }

        return res;
    }
    
}
