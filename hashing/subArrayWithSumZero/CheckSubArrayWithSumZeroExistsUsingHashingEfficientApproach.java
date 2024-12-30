package hashing.subArrayWithSumZero;

import java.util.HashSet;

/*
 * LOGIC : Use Prefix Sum and hashing
 * 
 * a0, a1, a2, ...., ai-1, ai, ai+1, ......, aj......an-1
 * ai, ai+1, ......, aj ==> Sum is zero
 * 
 * Then , 
 *  
 * Sum(a0, a1, a2, ...., ai-1, ai, ai+1, ......, aj) == Sum(a0, a1, a2, ...., ai-1)
 * 
 * 
 * Do prefix sum and store in HashSet, if we encounter same prefix sum again that means we got the subarray with sum zero
 * It will handle elments with value zero as well.
 *
 * 
 * TIME COMPLEXITY : O(N)
 * AUXILIARY SPACE : O(N)
 */

public class CheckSubArrayWithSumZeroExistsUsingHashingEfficientApproach {

    public static void main(String args[]){

        int arr[] = {-3, 4, -3, -1, 1};
        System.out.println("Does subarray with sum zero exists ? "+isSubArrayWithSumZeroExists(arr,arr.length));

    }
    

    public static boolean isSubArrayWithSumZeroExists(int arr[], int n){
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;

        for(int i=0; i<n; i++){
            sum += arr[i];
            
            if(set.contains(sum)){
                return true;
            }

            set.add(sum);

        }
        
        return false;

    }

}
