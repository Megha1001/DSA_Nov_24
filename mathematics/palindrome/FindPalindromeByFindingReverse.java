package mathematics.palindrome;

/*
 * Logic : Find the reverse of number and compare with original number. If matches return true else false.
 * 
 * TIME COMPLEXITY : Theta(d), where d is number of digits
 * AUXILIARY SPACE : Theta(1)
 */

public class FindPalindromeByFindingReverse {
    
    public static void main(String args[]){
        int input = 876678;
        System.out.println("is the given number palindrome ? "+isPalindrome(input));
    }


    public static boolean isPalindrome(int n){
        int temp = n;
        int result = 0;

        while(temp != 0){
            int lastDigit = temp%10;
            result = result*10 + lastDigit;
            temp /= 10;
        }

        return n == result;
    }

}
