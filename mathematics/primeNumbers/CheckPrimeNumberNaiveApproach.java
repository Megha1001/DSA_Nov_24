package mathematics.primeNumbers;

/*
 * Prime number : A number which is only divisible by 1 and itself. 
 * Note : 1 is neither a prime nor composite number
 * 
 * 
 * TIME COMPLEXITY : O(n-5)
 */

public class CheckPrimeNumberNaiveApproach {

    public static void main(String args[]){
        int n = 101;
        System.out.println("is the given number prime ? "+checkPrime(n));
    }


    public static boolean checkPrime(int n){
        if(n==1){
            return false;
        }

        if(n==2 || n==3){
            return true;
        }

        //divisible by 2 or 3
        if(n%2==0 || n%3==0){
            return false;
        }

        for(int i=5; i<n; i++){
            if(n%i==0){
                return false;
            }
        }

        return true;
    }
    
}
