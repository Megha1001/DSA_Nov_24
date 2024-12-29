package hashing.countDistinctElements;

import java.util.HashSet;

/*
 * TIME COMPLEXIY : Theta(N)
 * AUXILIARY SPACE : O(N) --> *****NOTE THAT*****
 * why TC : Theta(N) ? because before insertion we are checking it in . if not present then we are inserting it
 * why Auxiliary space : O(N) ? 
    Hashset can contain 1 item(if all elements are same in given array) or may contain all the items(if all are distinct in given array)
 */

public class CountDistinctElementsUsingHashSet {
    
    public static void main(String args[]){
        int arr[] = {15,12,13,12,13,13,18};

        System.out.println("Number of distinct elements in given array is : "+countDistinct(arr));
    }

    public static int countDistinct(int arr[]){
        HashSet<Integer> set = new HashSet<>();

        for(int i : arr){
            set.add(i);
        }

        return set.size();
    }
    
}
