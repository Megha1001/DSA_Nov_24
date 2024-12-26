package sorting.minimumDifferenceInAnArray;
import java.util.Arrays;

public class FindMinimumDifferenceInAnArrayUsingSortFunction {

    public static void main(String args[]){

        int arr[] = {1, 8, 12, 5, 18};

        System.out.println("Minimum difference in an array is : "+findMinDiff(arr, arr.length));

    }

    public static int findMinDiff(int arr[], int n){
        Arrays.sort(arr); //O(nLogN)

        int min = Integer.MAX_VALUE;


        for(int i=0; i<n-1; i++){ //O(N)
            int diff = arr[i+1] - arr[i];
            min = Math.min(min, diff);
        }

        return min;

    }
    
}
