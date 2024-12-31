package hashing.longestConsecutiveSubSequence;

/*
 * Question : We need to find the longest subsequence in the form of x, x+1, x+2, ...., x+i with these element appearing in ANY order
 */

public class FindLongestConsecutiveSubSequenceLengthUsingNaiveApproach {

    public static void main(String args[]){
        int arr[] = {1,9,3,4,2,20};
        
        System.out.println("The longest consecutive subsequence length in given array is : "+findLongestSubSequenceLengthWithConsecutiveElements(arr, arr.length));
    }

    public static int findLongestSubSequenceLengthWithConsecutiveElements(int arr[], int n){

        int res = 1;



        for(int i=0; i<n; i++){
            int count=1;
            for(int j=i+1; j<n; j++){
                if(arr[j]-arr[i]==1){
                    ++count;
                }else{
                    count=1;
                }
            }
            res = Math.max(res, count);
        }

        return res;

    }
    
}
