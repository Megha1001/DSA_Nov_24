package mathematics.factorial;

/*
 * TIME COMPLEXITY : Theta(N)
 * AUXILIARY SPACE : Theta(N)
 */

public class FindFactorialRecursive {

    public static void main(String args[]){
        int input = 7;
        System.out.println("The factorial of input "+input+" is : "+findFactorial(input));
    }

    public static int findFactorial(int n){

        if(n==0||n==1){
            return 1;
        }

        return n* findFactorial(n-1);

    }

}
