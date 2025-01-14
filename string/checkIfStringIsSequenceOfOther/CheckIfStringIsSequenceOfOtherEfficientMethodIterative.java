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
 * TIME COMPLEXITY : O(N+M), where N and m are lengths of s1 and s2 respectively
 * AUXILIARY SPACE : O(1)
 */


public class CheckIfStringIsSequenceOfOtherEfficientMethodIterative {

    public static void main(String args[]){
        String s1 = "ABCD";
        String s2 = "AD"; //true
        // String s1 = "ABCDE";
        // String s2 = "AED"; //false

        System.out.println("does s2 is subsequence of s1 ? "+checkIfSubsequence(s1, s2));
    }


    public static boolean checkIfSubsequence(String s1, String s2){

        int i=0; int j=0;

        int n1 = s1.length(); int n2 = s2.length();

        //corner case
        if(n2 > n1){
            return false;
        }

        while(i<n1 && j<n2){
            if(s1.charAt(i)==s2.charAt(j)){
                ++i; ++j;
            }else{
                ++i;
            }
        }

        return j==n2;
    }
    
}
