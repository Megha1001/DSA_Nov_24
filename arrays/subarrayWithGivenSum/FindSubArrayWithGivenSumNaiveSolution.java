package arrays.subarrayWithGivenSum;

public class FindSubArrayWithGivenSumNaiveSolution {

    public static void main(String args[]){
        int arr[] = {1, 4, 20, 3, 10, 5};
        int sum = 33;
        System.out.println("Do se have suarray with given sum : "+checkSum(arr, arr.length, sum));
    }
    
}
