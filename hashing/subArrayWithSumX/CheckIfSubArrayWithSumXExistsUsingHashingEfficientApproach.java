package hashing.subArrayWithSumX;

import java.util.HashSet;

/*
 * LOGIC Prefix Sum
 * 
 * a0, a1, a2, ...., ai-1, ai, ai+1, ......, aj......an-1
 * 
 * Sum(a0, a1, a2, ...., ai-1) = prefix1
 * Sum(ai, ai+1, ......, aj) = x
 * Sum(a0, a1, a2, ...., ai-1, ai, ai+1, ......, aj) = prefix2
 * 
 * prefix1+x = prefix2
 * =>prefix2 - x = prefix1
 * 
 * TIME COMPLEXITY : O(N)
 * AUXILIARY SPACE : O(N)
 */

public class CheckIfSubArrayWithSumXExistsUsingHashingEfficientApproach {

    public static void main(String args[]){
        int arr[] = {5, 8, 6, 13, 3, -1};
        int x = 22;

        System.out.println("Does subarray with sum "+x+" exists ?"+checkIfSubArrayExists(arr, arr.length, x));
    }


    public static boolean checkIfSubArrayExists(int arr[], int n, int x){
        
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;

        for(int i=0; i<n; i++){
            sum+= arr[i];
            /*
             * Note : Need for the cases where sum itself becomes x . For ex : {2,3,4,6}, x=9. Basically when the result subarray that are prefix of the array.
             *  Other way to handle these kind of cases is to add zero in the set explicitly.
             */
            if(sum==x){
                return true;
            } else if (set.contains(sum-x)){
                return true;
            }  
            set.add(sum);
        }

        return false;
    }
    
}
