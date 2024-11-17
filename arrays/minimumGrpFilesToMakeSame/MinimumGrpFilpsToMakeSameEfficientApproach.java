package arrays.minimumGrpFilesToMakeSame;


/*
 * LOGIC : 
 * 1. There can be atmost 1 difference b/w the groups
 * 2. if the first and last element is different then difference is 1
 * 3. if the first and last element is same then difference is 0
 * 
 * We need to flip the second group
 */

public class MinimumGrpFilpsToMakeSameEfficientApproach {
    
    public static void main(String args[]){
        int arr[] = {0, 0, 1, 1, 0, 0, 1, 1, 0};
        System.out.println("Flips sequence is ");
        printFlips(arr, arr.length);
    }



}
