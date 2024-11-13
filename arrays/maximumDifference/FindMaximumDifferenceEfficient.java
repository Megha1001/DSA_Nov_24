package arrays.maximumDifference;

/*
 * Logic : Traverse array from L to R and maintain a min value seen so far. For every element subtract min from it and keep min updated.
 */

public class FindMaximumDifferenceEfficient {
    

    public static void main(String args[]){
        int arr[]={2,3,10,6,4,8,1};
        System.out.println("Maximum difference is "+findMaxDiff(arr, arr.length));
    }


    public static int findMaxDiff(int arr[], int n){
        int res = arr[1]-arr[0];
        int minValue = arr[0];

        for(int i=1; i<n; i++){
            res = Math.max(res, arr[i]-minValue);
            minValue= Math.min(minValue, arr[i]);
        }

        return res;
    }

}
