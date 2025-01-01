package string.checkPalindrome;

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
