package recursion.subsets;

/*
 * TIME COMPLEXITY : For the given string of length n there can be 2^n subsets. Theta(2^n)
 * AUXILIARY SPACE : Theta(N)
 */

public class FindSubsetsUsingRecursion {


    public static void main(String args[]){
        String input = "abc";
        System.out.println("Subsets of given string are as follows ");

        String subset = "";
        int k = 0;

        printSubsets(input, subset, k);
    }

    public static void printSubsets(String input, String curr, int k){

        if(input.length() == k){
            System.out.print(curr+" ");
            return;
        }

        //without considering char
        printSubsets(input, curr+input.charAt(k), k+1);
        
        //considering char
        printSubsets(input, curr, k+1);


    }
    
}
