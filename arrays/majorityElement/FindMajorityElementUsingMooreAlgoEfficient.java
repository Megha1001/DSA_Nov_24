package arrays.majorityElement;

/*
 * LOGIC : Use Moore's algorithm --> it can return any idex of majority element
 * 
 * TIME COMPLEXITY : Theta(N);
 * AUXILIARY SPACE : Theta(1)
 */

public class FindMajorityElementUsingMooreAlgoEfficient {
    
    public static void main(String args[]){
        int arr[] = {8, 3, 4, 8, 8};
        // int arr[] = {3, 7, 4, 7, 7, 5}; //no majority
        System.out.println("Majority element in given array is "+findMajority(arr, arr.length));
    }


    public static int findMajority(int arr[], int n){
    
       //Phase 1
       int candidate = findCandidate(arr, n);

       //Phase 2 : check canditate
        int res = checkCandidate(arr, n, candidate);

        return res;

    }

    public static int checkCandidate(int arr[], int n, int candidate){

        int count = 0;
        for(int i = 0; i < n; i++){
            if(arr[candidate] == arr[i]){
                ++count;
            }
        }

        if(count <= n/2){
            return -1;
        }
        
        return candidate;

    }


    public static int findCandidate(int arr[], int n){
         //find candidate
         int res = 0; //index
         int count = 1;
 
         for(int i = 1; i < n; i++){
             if(arr[i] == arr[res]){
                 ++count;
             }else{
                 --count;
             }
 
             if(count == 0){
                 res = i;
                 count = 1;
             }
         }

         return res;
    }

}
