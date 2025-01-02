package string.checkAnagrams;

/*
 * TIME COMPLEXITY : Theta(N1+N2)
 * AUXILIARY SPACE : O(1)
 */

public class CheckWhetherGivenStringsAreAnagramsUsingUsingArray {


    public static void main(String args[]){
        String s1 = "listen";
        String s2 = "silent";

        System.out.println("are given strings anagrams ? "+checkAnagram(s1, s2, s1.length(), s2.length()));
    }


    public static boolean checkAnagram(String s1, String s2, int n1, int n2){
        
        //base case
        if(n1!=n2){
            return false;
        }

        int arr[] = new int[26];

        //populate array for first string
        for(int i=0; i<n1; i++){
            arr[s1.charAt(i) - 'a']++;
        }

        //reduce array for second string
        for(int j=0; j<n2; j++){
            arr[s2.charAt(j) - 'a']--;
        }

        //validate 
        for(int i=0; i<26; i++){
            if(arr[i]!=0){
                return false;
            }
        }

        return true;

    }
    
}
