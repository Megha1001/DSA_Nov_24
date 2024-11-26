package searching.medianOfTwoSortedArray;

/*
 * This method finds the median of two sorted arrays without mergin them. The algorithm uses binary search on smaller array for efficiency
 * 
 * Algorithm Overview : 
 *  1. use binary search to partition the smaller array(arr1) into two halves.
 *  2. The Partition in the second array (arr2) is derived dynamically to ensure the total number of elements in the left and right halves of the combines array is balanced.
 * 
 *  Partition Validity :
 *  - A partition is valid if : 
 *      max1 <= min2 && max2 <= min1
 *    where : 
 *      max1 = largest element in the left partition of arr1
 *      min1 = smallest element in the right partition of arr1
 *      max2 = largest element in the left partition of arr2
 *      min2 = smallest element in the right partition of arr2
 * 
 * Median calculation
 *  - if the partition is valid
 *         - For odd total elements : Median = Max(max1, max2);
 *         - For even total elements : Median = (Max(max1, max2) + Min(min1, min2)) /2
 *  
 *  - If the partition is invalid :
 *          - Adjust the binary search range in arr1
 *              - if max1 > min2 , move the partition left (end1 = i1 - 1).
 *              - if max2 > min1 , move hte partition right (begin1 = i1 + 1).
 * 
 * 
 * TIME COMPLEXITY : O(log(min(n1, n2)))
 * 
 * Edge cases : 
 *   - Handles cases where one array is empty by treating its boundaries as Integer.MIN_VALUE and Integer.MAX_VALUE
 *   - Works for different size of array
 */

public class FindMedianOfTwoSortedArrayUsingBinarySearch {

    public static void main(String args[]){
        int arr1 [] = {10, 20 , 30, 40, 50};
        int arr2 [] = {5, 15, 25, 35, 45};
        // int arr1 [] = {1, 2 , 3, 4};
        // int arr2 [] = {5, 15, 25, 35, 45};
        System.out.println("The median for two sorted array is "+findMedian(arr1, arr2, arr1.length, arr2.length));
    }

    public static double findMedian(int arr1[], int arr2[], int n1, int n2){
        
        int begin1 = 0, end1 = n1-1;

        while(begin1 <= end1){

            int i1 = (begin1 + end1) / 2;
            int i2 = (n1 + n2 + 1)/2 - i1;
            /*
             * Why Add 1?: When the total number of elements is odd, the left partition should have one more element than the right partition.
             */

            int min1 = (i1 == 0) ? Integer.MAX_VALUE : arr1[i1 - 1];
            int max1 = (i1 == n1) ? Integer.MIN_VALUE : arr1[i1];

            int min2 = (i2 == 0) ? Integer.MAX_VALUE : arr2[i2 - 1];
            int max2 = (i2 == n2) ? Integer.MIN_VALUE : arr2[i2];


            //found the median
            if( max1 <= min2 && max2 <= min1){
                if((n1+n2)%2 == 0){
                    return (double)((Math.min(min1, min2)+Math.max(max1, max2)))/2; // take care : first calculate double then do /2
                }else{
                    return (double)(Math.max(max1, max2));
                }
            }

            //decide where to go -> we are moving in n1 only

            if(max1 > min2){ //go to left in n1
                end1 = i1 - 1;
            }else{
                begin1 = i1 + 1;
            }

        }

        return -1;
    }
}
