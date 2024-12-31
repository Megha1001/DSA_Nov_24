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
 * 
 */


public class CountDistinctElmentsInEveryWindowUsingHashingEfficientApproach {

    public static void main(String args[]){
        int arr[] = {10,20,20,10,30,40,10};
        int k = 4;

        // int arr[] = {10,10,10};
        // int k = 3;

        System.out.print("The distinct elements in window of "+k+" is : ");
        printCountOfDistinctElementsInKWindow(arr, arr.length, k);
    }
    
    public static void printCountOfDistinctElementsInKWindow(int arr[], int n, int k){
    }
    
}
