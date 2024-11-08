package recursion.palindrome;

public class FindPalindromeUsingRecursion {

    public static void main(String args[]){
        String input = "abbcbba";
        int startIdx = 0;
        int endIdx = input.length()-1;
        System.out.println("is given string palindrome ? "+isPalindrome(input, startIdx, endIdx));
    }


    public static boolean isPalindrome(String input, int s, int e){

        //base condition
        if(s>e){
            return true;
        }

        //if found not equal then return false;
        if(input.charAt(s) != input.charAt(e)){
            return false;
        }

        return isPalindrome(input, s+1, e-1);

    }
    
}
