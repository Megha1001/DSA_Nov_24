package arrays.maximumLengthEvenOddSubarray;

public class FingMaximumLengthEvenOddSubarrayNaiveSolution {

    public static void main(String args[]){
        int arr[] = {10, 12, 14, 7, 8};

        System.out.println("Maximum length of even-odd subarray is "+findMaxLengthEvenOddSubarray(arr, arr.length));
    }

    public static int findMaxLengthEvenOddSubarray(int [] arr, int n){
        int res = 0;
        int curr = 1;
        for(int i = 0; i < n-1; i++){
        
            if((arr[i]%2==0 && arr[i+1]%2!=0)||(arr[i]%2!=0 && arr[i+1]%2==0)){
                ++curr;
            }else{
                //same types of number
                res = Math.max(res, curr);
                curr = 1;
            }
            res = Math.max(res, curr);
        }

        return res;
    }
    
}
