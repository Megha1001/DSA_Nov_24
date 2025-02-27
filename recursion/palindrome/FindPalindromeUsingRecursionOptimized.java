package recursion.palindrome;


/*
 * TIME COMPLEXITY : O(N), specifically N/2
 * AUXILIARY SPACE : O(N) , specifically N/2
 */

public class FindPalindromeUsingRecursionOptimized {

    public static void main(String args[]){
        String input = "abbabbabba";
        int startIdx = 0;
        int endIdx = input.length()-1;
        System.out.println("is the given number palindrome : ?"+isPalindrome(input, startIdx, endIdx));
    }

    public static boolean isPalindrome(String input, int startIdx, int endIdx){

        // base case -> n==0 || n==1 return true, n becomes zero when string length is even and n becomes 1 when string length is odd.
        /*
         * startIdx == endIdx , when string length is odd
         * startIdx >= endIdx , when string length is even
         */
        if(startIdx >= endIdx){
            return true;
        }

        return (input.charAt(startIdx) == input.charAt(endIdx)) && isPalindrome(input, startIdx+1, endIdx-1);
    }
    
}
