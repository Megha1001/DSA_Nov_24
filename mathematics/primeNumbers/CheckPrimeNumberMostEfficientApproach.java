package mathematics.primeNumbers;
/*
 * Logic : 
 * 1. Divisors are always appears in pair
 *  30 -> (1,30), (2,15), (3,10), (5,6)
 *  if x*y =n => x*x <=n (considering x <=y) => x <= Sqrt(N)
 * 
 * Explaination of for(int i=5; i*i <=n; i=i+6){
 * 1. identifying prime candidates
 * - every integer can be classified based on its remainder when divided by 6, the possible remainders are: 0,1,2,3,4,5
 * - Among these, we can eliminate some immediately
 *      0: 6n is divisible by 6
 *      2: 6n+2 is divisible by 2
*       3: 6n+3 is divisible by 3
*       4: 6n+4 is divisible by 4
 * - The only remainders that could potentially correspond to prime numbers greater than 3 are 1, and 5.
 *      - 6n+1 (like 7, 13, 19)
 *      - 6n-1 (like 5, 11, 17)
 * 
 * 2. Skipping non prime candidates : 
 *  By checking numbers of the form 6n+1 and 6n-1 , you skip over numbers that are guranteed to be composite(non prime)
 * - this mean instead of checking every single number, you only check number that could potentially be prime.
 * n%i==0  ==> checking for 6n-1
 * n%(i+2)==0) ==> checking for 6n+1
 * 
 */

public class CheckPrimeNumberMostEfficientApproach {

    public static void main(String args[]){
        int input = 1031;
        System.out.println("is the given number a prime  ? "+checkPrime(input));
    }


    public static boolean checkPrime(int n){

        //base
        if(n==1){
            return false;
        }

        if(n==2||n==3){
            return true;
        }

        if(n%2==0 || n%3==0){
            return false;
        }


        for(int i=5; i*i <=n; i=i+6){
            if(n%i==0 || n%(i+2)==0){
                return false;
            }
        }

        return true;
    }
    
}
