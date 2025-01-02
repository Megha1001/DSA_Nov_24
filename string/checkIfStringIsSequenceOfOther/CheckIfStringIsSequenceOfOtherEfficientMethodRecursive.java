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
 * TIME COMPLEXITY : (Length(S1)) OR O(N) where N is length of s1
 * AUXILIARY SPACE : O(1)
 */


public class CheckIfStringIsSequenceOfOtherEfficientMethodRecursive {

    public static void main(String args[]){
        // String s1 = "ABCD";
        // String s2 = "AD"; //true
        String s1 = "ABCDE";
        String s2 = "AED"; //false

        System.out.println("does s2 is subsequence of s1 ? "+checkIfSubsequence(s1, s2, 0, 0));
    }


    public static boolean checkIfSubsequence(String s1, String s2, int n1, int n2){

        //base condition
        if(s2.length()==n2){
            return true;
        }else if(n1==s1.length()){
            return false;
        }

        if(s1.charAt(n1)==s2.charAt(n2)){
            return checkIfSubsequence(s1, s2, n1+1, n2+1);
        }
        
        return checkIfSubsequence(s1, s2, n1+1, n2);

    }
    
}
