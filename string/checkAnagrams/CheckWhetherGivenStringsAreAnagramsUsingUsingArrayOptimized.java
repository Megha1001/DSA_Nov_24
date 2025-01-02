package string.checkAnagrams;

/*
 * TIME COMPLEXITY : O(N) or more specific O(N+CHAR)
 * AUXILIARY SPACE : O(1) or more specific O(CHAR)
 */

public class CheckWhetherGivenStringsAreAnagramsUsingUsingArrayOptimized {


    private static int CHAR = 256;

    public static void main(String args[]){
        String s1 = "listen";
        String s2 = "silent";

        System.out.println("are given strings anagrams ? "+checkAnagram(s1, s2, s1.length(), s2.length()));
    }


    public static boolean checkAnagram(String s1, String s2, int n1, int n2){
        
        if(n1!=n2){
            return false;
        }

        int count[] = new int[CHAR];

        for(int i=0; i<n1; i++){
            count[s1.charAt(i)-'a']++;
            count[s2.charAt(i)-'a']--;
        }

        for(int i=0; i<CHAR; i++){
            if(count[i]!=0){
                return false;
            }
        }

        return true;
        

    }
    
}
