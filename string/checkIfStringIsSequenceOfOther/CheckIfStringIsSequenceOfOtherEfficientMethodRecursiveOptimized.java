package string.checkIfStringIsSequenceOfOther;

/*
 * LOGIC : 
 * Keep two references - i & j
 * i point to s1 first character & j points to s2 first character
 *  if(s1.charAt(i)== s2.charAt(j)) then ++i; ++j
 *  else ++i;
 * 
 * return j==n2// j should reach at last
 * 
 * TIME COMPLEXITY : O(M+N)
 * AUXILIARY SPACE : O(M+N)
 */


public class CheckIfStringIsSequenceOfOtherEfficientMethodRecursiveOptimized {

    public static void main(String args[]){
        // String s1 = "ABCD";
        // String s2 = "AD"; //true
        String s1 = "ABCDE";
        String s2 = "AED"; //false

        System.out.println("does s2 is subsequence of s1 ? "+checkIfSubsequence(s1, s2, s1.length(), s2.length()));
    }


    public static boolean checkIfSubsequence(String s1, String s2, int n1, int n2){

        //base condition
        if(n2==0){
            return true;
        } 
        if(n1==0){
            return false;
        }

        if(s1.charAt(n1-1)==s2.charAt(n2-1)){
            return checkIfSubsequence(s1, s2, n1-1, n2-1);
        }else{
            return checkIfSubsequence(s1, s2, n1-1, n2);
        }

    }
    
}
