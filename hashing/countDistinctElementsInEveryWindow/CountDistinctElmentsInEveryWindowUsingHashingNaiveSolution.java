package hashing.countDistinctElementsInEveryWindow;

import java.util.HashSet;


public class CountDistinctElmentsInEveryWindowUsingHashingNaiveSolution {

    public static void main(String args[]){
        int arr[] = {10,20,20,10,30,40,10};
        int k = 4;

        System.out.println("The distinct elements in window of "+k+" is : ");
        printCountOfDistinctElementsInKWindow(arr, arr.length, k);
    }
    
    public static void printCountOfDistinctElementsInKWindow(int arr[], int n, int k){
       
        int res = 1;

        for(int i=0; i<n-k+1; i++){
            HashSet<Integer> s = new HashSet<>();

            for(int j=i; j<=i+k; j++){
                s.add(arr[i]);
            }

            res = Math.max(res, s.size());

        }

        return res;

    }
    
}
