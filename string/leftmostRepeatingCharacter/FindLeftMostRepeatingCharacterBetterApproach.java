package string.leftmostRepeatingCharacter;

/*
 * TIME COMPLEXITY : O(N)
 * AUXILIARY SPACE : O(1) or O(CHAR)
 */

public class FindLeftMostRepeatingCharacterBetterApproach {

    private static int CHAR = 256;

    public static void main(String args[]){
        String s = "acbbcd";
        System.out.println("The leftmost repeating character in given string is : "+(char)findLeftMostRepeating(s, s.length()));
    }

    public static int findLeftMostRepeating(String s, int n){

        int count[] = new int[CHAR];

        for(int i=0; i<n; i++){
            count[s.charAt(i)]++;
        }

        for(int i=0; i<n; i++){
            if(count[s.charAt(i)] > 1){
                return s.charAt(i);
            }
        }


        return -1; // not present
    }
    
}