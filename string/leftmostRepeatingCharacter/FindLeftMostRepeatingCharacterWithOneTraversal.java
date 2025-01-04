package string.leftmostRepeatingCharacter;

/*
 * TIME COMPLEXITY : O(N), one traversal
 * AUXILIARY SPACE : O(1)
 */

public class FindLeftMostRepeatingCharacterWithOneTraversal {

    public static void main(String args[]){
        String s = "abccdb";
        System.out.println("The leftmost repeating character is : "+(char)findLeftMostRepeatingChar(s));
    }

    public static int findLeftMostRepeatingChar(String s){

        int count[] = new int[256];

        for(int i=0; i<s.length(); i++){
            int curr = count[s.charAt(i)];
            if(curr==1){
                return s.charAt(i);
            }
            count[s.charAt(i)] = 1;
        }

        return -1;
    }
    
}
