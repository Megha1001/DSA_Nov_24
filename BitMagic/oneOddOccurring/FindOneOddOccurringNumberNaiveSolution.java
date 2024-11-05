package BitMagic.oneOddOccurring;

/*
 * Assumption : Only one number is there that appears odd number of times
 * 
 * TIME COMPLEXITY : O(N^2)
 */

public class FindOneOddOccurringNumberNaiveSolution {

    public static void main(String args[]){
        int arr[] = {7,3,7,7,7};
        System.out.println("The number occurring odd number of times is : "+findOddOccurringNum(arr));
    }

    public static int findOddOccurringNum(int arr[]){

        int len = arr.length;

        for(int i=0; i<len; i++){
            int count=0;
            for(int j=0; j<len; j++){
                if(arr[i]==arr[j]){
                    ++count;
                }
            }

            if(count%2 !=0){
                return arr[i];
            }
        }

        return -1;

    }
    
}
