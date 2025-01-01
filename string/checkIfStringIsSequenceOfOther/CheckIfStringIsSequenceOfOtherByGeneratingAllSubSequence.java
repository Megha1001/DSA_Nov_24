package string.checkIfStringIsSequenceOfOther;

/*
 * ABC : "", A, B, C, AB, AC, BC, ABC -> 2^n
 * 
 * LOGIC : Generate all the subsequence and check if other contains first
 * 
 */

public class CheckIfStringIsSequenceOfOtherByGeneratingAllSubSequence {

    public static void main(String args[]){
        String s1 = "ABCD";
        String s2 = "AD"; //true

        System.out.println("does s2 is subsequence of s1 ? "+checkIfSubsequence(s1, s2));
    }


    public static boolean checkIfSubsequence(String s1, String s2){

        return generateAllSubSequenceAndCheck(s1, "", 0, s2);
    }

    public static boolean generateAllSubSequenceAndCheck(String input, String curr, int k, String s2){
        

        return false;
    }
    
}
