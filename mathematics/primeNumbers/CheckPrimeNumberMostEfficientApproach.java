package mathematics.primeNumbers;
/*
 * Logic : 
 * 1. Divisors are always appears in pair
 *  30 -> (1,30), (2,15), (3,10), (5,6)
 *  if x*y =n => x*x <=n (considering x <=y) => x <= Sqrt(N)
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
