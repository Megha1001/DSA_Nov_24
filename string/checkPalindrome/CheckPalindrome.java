package string.checkPalindrome;

/*
 * TIME COMPLEXITY : O(str.length)
 * AUXILIARY SPACE : O(1)
 */

public class CheckPalindrome {
    
    public static void main(String args[]){
        String s = "ABCDCBAe";
        System.out.println("Is given string palindrome ? "+checkPalindrome(s, s.length()));
    
    }

    public static boolean checkPalindrome(String s, int n){
        
        for(int i=0; i<n; i++){
            if(s.charAt(i)!= s.charAt(n-1-i)){
                return false;
            }
        }

        return true;
    }
    
}
