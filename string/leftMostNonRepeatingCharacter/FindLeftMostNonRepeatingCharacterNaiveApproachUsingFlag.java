package string.leftMostNonRepeatingCharacter;

public class FindLeftMostNonRepeatingCharacterNaiveApproachUsingFlag {
    public static void main(String args[]){
        String s = "abbcc";
        System.out.println("The leftmost non repeating character is : "+(char)findLeftMostNonRepeatingChar(s));
    }

    public static int findLeftMostNonRepeatingChar(String s){
        int res = -1;

        for(int i=0; i<s.length(); i++){
            boolean flag = false;
            for(int j=0 ; j< s.length(); j++){
                if(i!=j && s.charAt(i) == s.charAt(j)){
                    flag = true;
                    break;
                }
            }

            if(!flag){
                return s.charAt(i);
            }
        }

        return res;

    }

}
