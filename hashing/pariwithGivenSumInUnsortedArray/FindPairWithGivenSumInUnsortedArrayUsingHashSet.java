package hashing.pariwithGivenSumInUnsortedArray;

import java.util.HashSet;

public class FindPairWithGivenSumInUnsortedArrayUsingHashSet {

    public static void main(String args[]){

        int arr[] = {3, 3, 4, 2}; 
        int x = 6;

        System.out.println("Pair with given sum exists in given array ? "+checkIfSumExists(arr, x));
    }
    

    public static boolean checkIfSumExists(int arr, int x){
        HashSet<Integer> complements = new HashSet<>();

        for(int num : arr){

        }


        return false;
    }


}
