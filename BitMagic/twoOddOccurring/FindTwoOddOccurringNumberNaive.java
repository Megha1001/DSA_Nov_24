package BitMagic.twoOddOccurring;


/*
 * LOGIC : Traverse through the array , count occurrence of every number. If number is odd, print the number.
 * 
 * TIME COMPLEXITY : Theta(N^2)
 * AUXILIARY SPACE : Theta(1)
 */

public class FindTwoOddOccurringNumberNaive {

    public static void main(String args[]){
        int arr[] = {3,4,5,5,5,5};
        System.out.println("The numbers that are occurring odd times are : ");
        printOddOccurrence(arr);
    }

    public static void printOddOccurrence(int arr[]){
        int len = arr.length;
        for(int i=0; i<len; i++){
            int count=0;
            for(int j=0; j<len; j++){
                if(arr[i]==arr[j]){
                    ++count;
                }
            }
            if(count%2!=0){
                System.out.print(arr[i]+" ");
            }
        }

    }
    
}
