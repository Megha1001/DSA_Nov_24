package recursion.sumOfDigits;


/*
 * LOGIC : 
 * 1. get the last digit by doing n%10
 * 2. update the number by n/10
 * 
 * Note ; We can reduce the call by 1 , for n<=9 we can return number itself.
 * 
 * TIME COMPLEXITY : Theta(d), where d is digits in given number.
 * AUXILIARY SPACE : Theta(d), where d is digits in given number.
 * 
 * 
 * Note : For this kind of problem we prefer iterative solution instead of recursive since it has a overhead of recursive call which is not there in iterative
 * 
 * 
 * ITERATIVE SOLUTION : 
 *      int sum = 0;
 *      while(n>0){
 *          sum += n%10;
 *          n = n/10;
 *      }
 *      return sum;
 * 
 */


public class FindSumOfDigitsUsingRecursionOptimizationByReducingOneCall {
    
    public static void main(String args[]){
        int num = 8790;
        System.out.println("Sum of digits of the given number is "+findSumOfDigits(num));
    }

    public static int findSumOfDigits(int num){

        //base case
        if(num<=9){
            return num;
        }

        return findSumOfDigits(num/10) + (num%10);

    }
    
}
