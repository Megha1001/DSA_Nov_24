package hashing.printFrequeny;

import java.util.HashMap;
import java.util.Map;

/*
 * LOGIC : To print in the order that they appear in given array : Use LinkedHashMap
 * 
 * Time COMPLEXITY : Theta(N), under assumption that HashMap operations takes O(1)
 * AUXILIARY SPACE : O(N)
 */

public class PrintFrequencyOfArray {
    
    public static void main(String args[]){
        int arr[] = {10,12,10,15,10,20,12,12};

        System.out.println("Frequency are as follows");
        printFreq(arr, arr.length);
    }

    public static void printFreq(int arr[], int n){
        HashMap<Integer, Integer> map = new HashMap<>();

        // TIME COMPLEXITY : 
        for(int i=0; i<n; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        // System.out.println("map : "+map);

        // Time Complexity : O(N) : Can we one element but in worst case all elements appears only once.
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            System.out.println(e.getKey()+":"+e.getValue());
        }

    }

}
