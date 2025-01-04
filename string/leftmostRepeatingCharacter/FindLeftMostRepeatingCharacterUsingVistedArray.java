package string.leftmostRepeatingCharacter;

public class FindLeftMostRepeatingCharacterUsingVistedArray {

    public static void main(String args[]){
        String s = "abccdb";
        System.out.println("The leftmost repeating character is : "+(char)findLeftMostRepeatingChar(s));
    }

    public static int findLeftMostRepeatingChar(String s){
        int res = -1;
        boolean visited[] = new boolean[256];

        for(int i=0; i<s.length(); i++){
            if(visited[s.charAt(i)]){
                res = i; // have to assign otherwise it will return c.
            } else{
                
            }
        }

        return res ;
    }
    
}
