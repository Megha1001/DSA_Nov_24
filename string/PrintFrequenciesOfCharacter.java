package string;


/*
 * TIME COMPLEXITY : Theta(length Of string)
 * AUXILIARY SPACE : O(1)
 */

public class PrintFrequenciesOfCharacter {

    public static void main(String args[]){
        String name = "meghaverma";
        System.out.println("Frequencies with character in order are : ");
        printFreq(name, name.length());
    }


    public static void printFreq(String name, int len){
        int count[] = new int[26];

        for(int i=0; i<len; i++){
            count[name.charAt(i)-'a']++;
        }

        for(int i=0; i<26; i++){
            if(count[i]>0){
                System.out.println((char)('a'+i)+":"+count[i]);
            }
            
        }

    }

    
}
