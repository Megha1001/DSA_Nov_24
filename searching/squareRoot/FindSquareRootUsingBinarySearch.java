package searching.squareRoot;

/*
 * LOGIC :: Using binary search
 * 1. Consider number from low(1) to n(num)
 * 2. Find x/2 , 
 *      if x/2*x/2 == num ==> return x
 *      else x/2*x/2 < num ==> that can be the answer and also do low = mid+1;
 *      else high = mid-1
 * 
 * TIME COMPLEXITY : O(logN)
 * AUXILIARY SPACE : Theta(1)
 */
public class FindSquareRootUsingBinarySearch {
    public static void main(String args[]){
        int num = 10;
        // int num = 0;
        System.out.println("Square root of given number is : "+findSqr(num, 1, num));
    }

    public static int findSqr(int num, int low, int high){

        int result = -1;

        while(low <= high){
            int mid = low + (high-low)/2;

            int sqr = mid*mid;
            if(sqr == num){
                return sqr;
            }else if(sqr > num){
                high = mid-1;
            }else{
                result = mid;
                low = mid+1;
            }
        }
        
        return result;

    }

}
