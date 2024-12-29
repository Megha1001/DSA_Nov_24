package hashing.countDistinctElements;

import java.util.HashSet;

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
