package string.leftmostRepeatingCharacter;

/*
 * LOGIC : Consider every character as the left most repeating and check in left string
 */

public class FindLeftMostRepeatingCharacterNaiveSolution {

    public static void main(String args[]){
        String s = "abccb"; //b
        System.out.println("The leftmost character in the "+(char)findLeftmostRepeatingChar(s, s.length()));
    }


    public static int findLeftmostRepeatingChar(String s, int n){

        for(int i=0; i<n; i++){
            char curr = s.charAt(i);
            for(int j=i+1; j<n; j++){
                if(curr == s.charAt(j)){
                    return (int)curr;
                }
            }
        }

        return -1;
    }
    
}
