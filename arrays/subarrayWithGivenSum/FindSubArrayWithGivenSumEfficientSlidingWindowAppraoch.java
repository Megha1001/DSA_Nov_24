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

    }
    
}
