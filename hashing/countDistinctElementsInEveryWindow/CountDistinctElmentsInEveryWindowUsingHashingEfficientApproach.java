package hashing.countDistinctElementsInEveryWindow;

import java.util.HashMap;

/*
 * LOGIC : Use Sliding WIndow technique.
 *  Input : {10,20,10,10,30,40}, k=4
 * 1. Create a frequency map of first K elements
 *  freq{10} = 3, freq{20} = 1
 * 
 * 2. print the size of map : 2
 * 3. for(int i=k; i<n; i++)
 *      Decrease the frequence of arr[i-k]
 *      If the frequency of arr[i-k] becomes zero, remove it from map
 *      If arr[i] doesn't exists in the map , insert it. Else increase its frequency by 1
 *      print the size of map.
 * 
 * TIME COMPLEXITY : O(N)
 * AUXILIARY SPACE : O(K)
 * 
 */


public class CountDistinctElmentsInEveryWindowUsingHashingEfficientApproach {

    public static void main(String args[]){
        int arr[] = {10,20,10,10,30,40};
        int k = 4;

        // int arr[] = {10,10,10};
        // int k = 3;

        System.out.print("The distinct elements in window of "+k+" is : ");
        printCountOfDistinctElementsInKWindow(arr, arr.length, k);
    }
    
    public static void printCountOfDistinctElementsInKWindow(int arr[], int n, int k){
        HashMap<Integer, Integer> freq = new HashMap<>();

        //create frequency map of first k elements
        for(int i=0; i<k ; i++){
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
        }

        //print size of first k elements freq map
        System.out.print(freq.size()+ " ");
        System.out.println("map : "+freq);

        for(int i=k; i<n; i++){
            //decrease the freq of arr[i-k]
            freq.put(arr[i-k], freq.getOrDefault(arr[i-k], 1) - 1);

            //remove the arr[i-k], if freq becomes zero
            if(freq.get(arr[i-k])==0){
                freq.remove(arr[i-k]);
            }

            //add arr[i] if not present else increase the frequency
            freq.put(arr[i], freq.getOrDefault(arr[i], 0)+1);

            //print size of map
            System.out.print(freq.size()+ " ");
            System.out.println("map : "+freq);

        }


    }
    
}
