package hashing.longestConsecutiveSubSequence;

import java.util.HashSet;
import java.util.Iterator;

/*
 * Question : We need to find the longest subsequence in the form of x, x+1, x+2, ...., x+i with these element appearing in ANY order
 * 
 * TIME COMPLEXITY : O(N*K)
 * AUXILIARY SPACE : O(N)
 * 
 * LOGICE : 1. We first insert all the elements in hash table(HashSet).
 * 2. We do lookup to find the result
 */

public class FindLongestConsecutiveSubSequenceLengthUsingHashing {

    public static void main(String args[]){

        int arr[] = {1,3,4,3,3,2,9,10};
        
        System.out.println("The longest consecutive subsequence length in given array is : "+findLongestSubSequenceLengthWithConsecutiveElements(arr, arr.length));
    }

    public static int findLongestSubSequenceLengthWithConsecutiveElements(int arr[], int n){

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> eligibleStartIdxForSubSequence = new HashSet<>();
        int count = 1;
        int res = 1;

        for(int i=0; i<n; i++){
            set.add(arr[i]);
        }


        // Find eligibile start idx for subsequence - Valid are whose arr[i]-1 elements not present in the set
        for(int i=0; i<n; i++){
            if(!set.contains(arr[i]-1)){
                eligibleStartIdxForSubSequence.add(arr[i]);
            }
        }


        Iterator<Integer> itr = eligibleStartIdxForSubSequence.iterator();

        while(itr.hasNext()){
            int element = itr.next();

            for(int i=1; i<n; i++){ // we are considering 1 element hence no need to run for n times.
                if(set.contains(element+i)){
                    ++count;
                }else{
                    res = Math.max(res, count);
                    count=1;
                }
            }

        }
        
        return res;

    }
    
}
