package arrays.maximumCircularSubarray;

public class FindMaximumCircularSubArrayModifiedKadanesAlgoEfficient {
    

    public static void main(String args[]){
        int arr[] = {3, -4, 5, 6, -8, 7};
        System.out.println("The maximum sum of circular subarray is : "+findMaximumSumInCircularSubarray(arr, arr.length));
    }
}
