package string.checkPalindrome;

/*
 * TIME COMPLEXITY : Theta(N) -> for reverse fun
 * AUXILIARY SPACE : Theta(N) --> for StringBuilder
 */

public class CheckPalindromeUsingReverseFunction {

    public static void main(String args[]){
        StringBuilder s = new StringBuilder("ABCDCBA");
        System.out.println("Is given string palindrome ? "+checkPalindrome(s, s.length()));
    
    }

    public static boolean checkPalindrome(StringBuilder s, int len){
        StringBuilder rev = s.reverse();

        return rev.equals(s);
    }

    
}
