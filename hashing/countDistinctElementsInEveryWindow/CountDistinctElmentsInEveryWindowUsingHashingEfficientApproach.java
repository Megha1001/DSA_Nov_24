package hashing.countDistinctElementsInEveryWindow;

import java.util.HashSet;

/*
 * TIME COMPLEXITY : Theta((n-k)*k)
 * AUXILIARY SPACE : O(k)
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
