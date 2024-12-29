package hashing.printFrequeny;

import java.util.HashMap;
import java.util.Map;

public class PrintFrequencyOfArray {
    
    public static void main(String args[]){
        int arr[] = {10,12,10,15,10,20,12,12};

        System.out.println("Frequency are as follows");
        printFreq(arr, arr.length);
    }

    public static void printFreq(int arr[], int n){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        // System.out.println("map : "+map);

        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            System.out.println(e.getKey()+":"+e.getValue());
        }

    }

}
