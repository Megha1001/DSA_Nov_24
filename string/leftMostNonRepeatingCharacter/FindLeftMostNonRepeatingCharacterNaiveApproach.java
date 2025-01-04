package string.leftMostNonRepeatingCharacter;

public class FindLeftMostNonRepeatingCharacterNaiveApproach {

    public static void main(String args[]){
        String s = "abbcc";
        System.out.println("The leftmost non repeating character is : "+(char)findLeftMostNonRepeatingChar(s));
    }

    public static int findLeftMostNonRepeatingChar(String s){
        int res = -1;

        int count[] = new int[256];

        for(int i=0; i<s.length(); i++){
            count[s.charAt(i)]++;
        }

        for(int i=0; i<s.length(); i++){
            if(count[s.charAt(i)]==1){
                return s.charAt(i);
            }
        }

        return res;
    }
    
}
