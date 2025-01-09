package string.reverseWordsInAString;

public class ReverseWordsInStringNaiveApproach {

    public static void main(String args[]){

        String input = "I am megha Verma.";
        String [] characters = input.split(" ");

        StringBuilder res = new StringBuilder();
        for(int i=0; i<characters.length; i++){

            res.append(new StringBuilder(characters[i]).reverse().append(" "));
        }

        System.out.println(res);
    }
    
}
