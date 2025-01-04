package string.leftMostNonRepeatingCharacter;

import java.util.Arrays;

public class FindLeftMostNonRepeatingCharacterEfficientApproachOneTraversal{

    public static void main(String args[]){
        String s = "abbcc";
        System.out.println("The leftmost non repeating character is : "+(char)findLeftMostNonRepeatingChar(s));
    }

    public static int findLeftMostNonRepeatingChar(String s){
        int temp[] = new int [256]; //count index of element that occurred only once
        int res = Integer.MAX_VALUE;

        Arrays.fill(temp, -1);

        for(int i=0; i<s.length(); i++){
            int currCharIndex = s.charAt(i);
            //first occurrence
            if(temp[currCharIndex]==-1){
                temp[currCharIndex] = i; // assigning index , so when we traverse temp array we can find the minimum
            }else{
                //to eliminate the more than one occurrence
                temp[currCharIndex] = -2;
            }

        }

        //traverse char array - O(1) - not count into traversal
        for(int i=0; i<256; i++){
            if(temp[i]>=0){
                res = Math.min(res, temp[i]);
            }
        }

        return res;

    }

}