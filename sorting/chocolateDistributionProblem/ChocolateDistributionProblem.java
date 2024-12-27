package sorting.chocolateDistributionProblem;

import java.util.Arrays;

/*
 * There are m students. The task is to distribute chocolate packets among m students such that-
 *  1. Each student gets exactly one packet
 *  2. the difference between maximum number of chocolates given to a student and minimum number of chocolates given to a student is minimum
 * 
 * LOGIC : Sort the array
 * 1. after sorting consider each element as begining of minimum difference subset and find all such subset difference 
 * 2. then pick minimum out of them
 * 
 * TIME COMPLEXITY : O(nLogN)
 * AUXILIARY SPACE : Theta(1)
 */

public class ChocolateDistributionProblem {

    public static void main(String args[]){

        int arr[] = {3, 4, 1, 9, 56, 7, 9, 12};
        int m = 5;

        System.out.println("The minimum difference btw the maximum number of chocolates given to a student and minimum number of chocolates given to a student is : "+findMinDifference(arr, arr.length, m));

    }

    public static int findMinDifference(int arr[], int n, int m){
        if(m>n){
            return -1;
        }

        Arrays.sort(arr); //O(nLogN)

        int res = arr[m-1] - arr[0];

        for(int i=1; (i+m-1) < n; i++){ //Theta(N)
            res = Math.min(res, arr[i+m-1]- arr[i]);
        }

        return res;
    }
    
}
