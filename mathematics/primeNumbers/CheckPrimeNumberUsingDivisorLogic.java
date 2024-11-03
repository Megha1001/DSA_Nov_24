package mathematics.primeNumbers;

/*
 * Logic : Divisors are always appear in pair
 *  30 -> (1,30), (2,15), (3,10), (5,6)
 *  
 * if x*y =n
 *  and if x<=y then
 *  x*x <=n => x <=Sqrt(n), Basically if the given number is not prime we can definately get the smaller divisor from i=5 to sqrt(n) , No need to traverse till n-1.
 * 
 * TIME COMPLEXITY : O(sqrt(N))
 * AUXILIARY SPACE : Theta(1)
 * 
 */

public class CheckPrimeNumberUsingDivisorLogic {

    public static void main(String args[]){
        int n = 101;
        System.out.println("is the given number prime : "+checkPrime(n));
    }


    public static boolean checkPrime(int n){

        //base case
        if(n==1){
            return false;
        }


        if(n==2 || n==3){
            return true;
        }

        //divisible by 2 or 3.
        if(n%2==0 || n%3==0){
            return false;
        }

        for(int i=5; i<=Math.sqrt(n); i++){  //for(int i=5; i*i<=n; i++){  Note that we are checking till <= not < since there can be the possiblity where the number is like 49 --> in that case sqrt(49) is 7 and we have to check for 7 as well
           if(n%i==0){
            return false;
           }
        }

        return true;
    }
    
}
