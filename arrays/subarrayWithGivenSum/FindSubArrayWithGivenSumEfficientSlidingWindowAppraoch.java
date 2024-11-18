package arrays.subarrayWithGivenSum;

/*
 * Logic : We use sliding window technique with a window of variable size
 * While curr is smaller than sum extend the window by increasing e
 * While curr is greater than sum shrink the window by increasing s
 * [4,8,12,5], s=0, e=0, sum=17, curr = 4
 *  curr = curr+8 = 12
 *  curr = curr+ 12 = 24
 *  24 > 17 --> increasing s
 *  24-4 = 20 > 17 --> increasing s
 *  20-8 = 12 < 17 --> icreasing e
 *  12+5 = 17 --> found
 * 
 */

public class FindSubArrayWithGivenSumEfficientSlidingWindowAppraoch {

    public static void main(String args[]){
        int arr[] = {4, 8, 12, 5};
        int sum = 17;

        System.out.println("Do we have subarray with given sum : "+checkSum(arr, arr.length, sum));

    }

    public static boolean checkSum(int arr[], int n, int x){
        int s = 0; int curr = 0;
        for(int e = 0; e < n; e++){
            curr += arr[e]; 
            while(curr > x){
                curr -= arr[s];
                --s; // why its safe to remove s , since when we have added last e it would have increased the sum  but with this element the sum is less even with earlier considered subarray so its safe to remove that
            }

            if(curr == x){
                return true;
                
            }
        }

        return false;
    }
    
}
