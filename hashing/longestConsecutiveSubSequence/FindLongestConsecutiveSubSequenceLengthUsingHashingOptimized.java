package hashing.longestConsecutiveSubSequence;

import java.util.HashSet;

/*
 * Question : We need to find the longest subsequence in the form of x, x+1, x+2, ...., x+i with these element appearing in ANY order
 * 
 * TIME COMPLEXITY : Theta(N) //******NOTE THAT******
 * AUXILIARY SPACE : O(N)
 * THERE ARE ALWAYS 2N LOOKupS AT moST
 * 
 * LOGICE : 1. We first insert all the elements in hash table(HashSet).
 * 2. We do lookup to find the result
 */

public class FindLongestConsecutiveSubSequenceLengthUsingHashingOptimized {

    public static void main(String args[]){

        int arr[] = {1,3,4,3,3,2,9,10};
        
        System.out.println("The longest consecutive subsequence length in given array is : "+findLongestSubSequenceLengthWithConsecutiveElements(arr, arr.length));
    }

    public static int findLongestSubSequenceLengthWithConsecutiveElements(int arr[], int n){

        HashSet<Integer> set = new HashSet<>();
        int res=1;

        // create set
        for(int i : arr){
            set.add(i);
        }
        
        for(Integer element : set){
            if(!set.contains(element-1)){ //check for begining of subsequence
                int curr = 1;
                while(set.contains(element+curr)){
                    ++curr;
                }
                res = Math.max(res, curr);

            }
        }

        return res;

    }
    
}
