package string.leftmostRepeatingCharacter;

/*
 * TIME COMPLEXITY : Theta(N), one traversal
 * AUXILIARY SPACE : O(1)
 */

public class FindLeftMostRepeatingCharacterWithOneTraversal {

    public static void main(String args[]){
        String s = "abcbc";
        System.out.println("The leftmost repeating character is : "+(char)findLeftMostRepeatingChar(s));
    }

    public static int findLeftMostRepeatingChar(String s){

        int count[] = new int[256];
        int res = Integer.MAX_VALUE;
        for(int i=0; i<s.length(); i++){
            int curr = count[s.charAt(i)];
            if(curr==1){
                res= Math.min(s.charAt(i), res); // we should assign this to variable otherwise it will return c.
            } else{
                count[s.charAt(i)] = 1;
            }
            
        }

        return res;
    }
    
}
