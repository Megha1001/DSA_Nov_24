package arrays.maximumDifference;

/*
 * Our Task: Given an array arr[] of integers, find out the maximum difference between any two elements such that the larger element appears after the smaller number. 
 * Maximum value of arr[j]-arr[i] such that j>i
 * 
 * TIME COMPLEXITY : O(N^2)
 */
public class FindMaximumDifferenceNaive {

    public static void main(String args[]){
        int arr[]={2,3,10,6,4,8,1};
        System.out.println("Maximum difference is "+findMaxDiff(arr, arr.length));
    }
    

    public static int findMaxDiff(int arr[], int n){
        int maxDiff=-1;

        for(int i=0; i<n;i++){
            for(int j=i+1; j<n; j++){
                int currDiff = arr[j]-arr[i];
                if(currDiff > maxDiff){
                    maxDiff = currDiff;
                }
            }
        }

        return maxDiff;
    }

}
