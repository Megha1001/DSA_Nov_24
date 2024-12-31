package hashing.moreThanNByKOccurrences;

import java.util.HashMap;
import java.util.Map;

/*
 * TIME COMPLEXITY : O(N)
 * AUXILIARY SPACE : O(N)
 */

public class PrintElementsWithMoreThanNByKOccurrences {


    public static void main(String args[]){
        int arr[] = {30,10,20,20,10,20,30,30};
        int k = 4;

        System.out.println("Elements with occurrence more than n/k are : ");
        printElementsWithMoreThanNByKOccurrence(arr, arr.length, k);
    }
    
    public static void printElementsWithMoreThanNByKOccurrence(int arr[], int n, int k){
        HashMap<Integer, Integer> freq = new HashMap<>();

        //create map with freq
        for(int i=0; i<n; i++){
            freq.put(arr[i], freq.getOrDefault(arr[i], 0)+1);
        }

        for(Map.Entry<Integer, Integer> entry : freq.entrySet()){
            if(entry.getValue() > n/k){
                System.out.print(entry.getKey()+" ");
            }
        }
        

    }

}
