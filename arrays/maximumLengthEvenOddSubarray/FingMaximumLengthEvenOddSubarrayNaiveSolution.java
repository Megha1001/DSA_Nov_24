package arrays.maximumLengthEvenOddSubarray;

public class FingMaximumLengthEvenOddSubarrayNaiveSolution {

    public static void main(String args[]){
        int arr[] = {10, 12, 14, 7, 8};

        System.out.println("Maximum length of even-odd subarray is "+findMaxLengthEvenOddSubarray(arr, arr.length));
    }
    
}
