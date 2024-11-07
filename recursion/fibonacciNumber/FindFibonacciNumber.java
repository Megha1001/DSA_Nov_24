package recursion.fibonacciNumber;

/*
 * LOGIC : 
 *  fib(n) = fib(n-1) + fib(n-2)
 * 
 * Fibonacci Series : 0,1,1,2,3,5,...
 * start index : 0
 */

public class FindFibonacciNumber {

    public static void main(String args[]){
        int n = 5;
        System.out.println("The fibonacci number at given posistion is "+findFibonacciNum(n));
    }

    public static int findFibonacciNum(int n){
        
        //base case
        if(n==0 || n==1){
            return n;
        }

        return findFibonacciNum(n-1) + findFibonacciNum(n-2);

    }
    
}
