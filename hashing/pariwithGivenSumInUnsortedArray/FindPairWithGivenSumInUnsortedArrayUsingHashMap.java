package hashing.pariwithGivenSumInUnsortedArray;

import java.util.HashMap;

/*
 * TIME COMPLEXITY : O(N)
 * AUXILIARY SPACE : O(N)
 */

public class FindPairWithGivenSumInUnsortedArrayUsingHashMap {

    public static void main(String args[]){
        int arr[] = {3,2,8,15,-8};
        int x = 17;

        System.out.println("Pair with given sum exists in given array ? "+checkIfSumExists(arr, arr.length, x));
    }


    public static boolean checkIfSumExists(int arr[], int n, int x){


        return false;
    }
    
}
