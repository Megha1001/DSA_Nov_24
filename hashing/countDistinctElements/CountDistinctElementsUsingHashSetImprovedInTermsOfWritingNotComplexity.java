package hashing.countDistinctElements;

import java.util.HashSet;
import java.util.Arrays;

/*
 * TIME COMPLEXIY : Theta(N)
 * AUXILIARY SPACE : O(N) --> *****NOTE THAT*****
 * why TC : Theta(N) ? because before insertion we are checking it in . if not present then we are inserting it
 * why Auxiliary space : O(N) ? 
    Hashset can contain 1 item(if all elements are same in given array) or may contain all the items(if all are distinct in given array)
 */

public class CountDistinctElementsUsingHashSetImprovedInTermsOfWritingNotComplexity {
    
    public static void main(String args[]){
        Integer arr[] = {15,12,13,12,13,13,18}; // note type of data its Integer not int
        HashSet<Integer> set = new HashSet<>(Arrays.asList(arr));
        System.out.println("Number of distinct elements are : "+set.size());
    }

    
}
