package BitMagic.oneOddOccurring;

/*
 * LOGIC : 
 * 1. x ^ x ^ x ....... ^x --> Even times = 0
 * 2. x ^ x ^ x ....... ^x --> Odd times = x
 * 
 * So since in this question assumption is that we have only one number with odd occurrence, we can use
 *  above property since all other numbers will be even times and end up producing 0 and 0^x=0;
 */

public class FindOneOddOccurringNumberEfficientSolution {

    public static void main(String args[]){
        int arr[] = {7,3,7,7,7};
        System.out.println("The number occurring odd number of times is : "+findOddOccurringNum(arr));
    }


    public static int findOddOccurringNum(int arr[]){

        int res = arr[0];
        for(int i=1; i<arr.length; i++){
            res ^= arr[i];
        }
        return res;

    }
    
}
