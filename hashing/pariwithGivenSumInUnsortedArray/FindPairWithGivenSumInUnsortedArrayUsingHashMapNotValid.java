package hashing.pariwithGivenSumInUnsortedArray;

import java.util.HashMap;
import java.util.Map;

/*
 * Assumption : All elements are distinct
 * TIME COMPLEXITY : O(N)
 * AUXILIARY SPACE : O(N)
 */

public class FindPairWithGivenSumInUnsortedArrayUsingHashMapNotValid {

    public static void main(String args[]){
        // int arr[] = {3,2,8,15,-8};
        // int x = 17;
        int arr[] = {2,1,6,3};
        int x = 6;

        // int arr[] = {3, 3, 4, 2}; 
        // int x = 6;

        /*
         * The map becomes {3=3, 4=2, 2=4}, overwriting one of the 3 values. This causes the pair (3, 3) to be missed even though it is valid.


         */


        System.out.println("Pair with given sum exists in given array ? "+checkIfSumExists(arr, arr.length, x));
    }


    public static boolean checkIfSumExists(int arr[], int n, int x){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            map.put(arr[i], x-arr[i]);
        }


        System.out.println("map "+map);

        for(Map.Entry<Integer,Integer> e : map.entrySet()){

            /*
             * Need && condition since for example we are looking for sum=6 and map created with {2,1,6,3}; example is {1=5, 2=4, 3=3, 6=0} then 3=3 will get matched with itself
             */

             /*
             * Avoid self-pairing:
             * - Check if the complement exists in the map.
             * - Ensure the complement is not the same as the current key.
             */

            if(map.containsKey(e.getValue()) && !e.getKey().equals(e.getValue())){
                System.out.println("key : "+e.getKey()+"|value "+e.getValue());
                return true;
            }

        }

        return false;
    }
    
}
