package recursion.sumOfDigits;

/*
 * LOGIC : 
 * 1. get the last digit by doing n%10
 * 2. update the number by n/10
 * 
 * TIME COMPLEXITY : Theta(d), where d is digits in given number.
 * AUXILIARY SPACE : Theta(d), where d is digits in given number.
 */

public class FindSumOfDigitsUsingRecursion {

    public static void main(String args[]){
        int num = 8790;
        System.out.println("Sum of digits of the given number is "+findSumOfDigits(num));
    }

    public static int findSumOfDigits(int num){

        //base case
        if(num==0){
            return 0;
        }

        return findSumOfDigits(num/10) + (num%10);

    }
    
}
