package oneOfTheBestQs;

/*
 * LOGIC : 
 * 1. There can be atmost 1 difference b/w the groups
 * 2. if the first and last element is different then difference is 1
 * 3. if the first and last element is same then difference is 0
 * 
 * We need to flip the second group
 */

public class MinimumGrpFilpsToMakeSameEfficientApproach {
    
    public static void main(String args[]){
        // int arr[] = {0, 0, 1, 1, 0, 0, 1, 1, 0};
        int arr[] = {0, 0, 1, 1, 0, 0, 1, 1, 0, 1};
        System.out.println("Flips sequence is ");
        printFlips(arr, arr.length);
    }

    public static void printFlips(int arr[], int n){

        for(int i = 1; i < n; i++){

            if(arr[i] != arr[i-1]) { //either the start of second group or end of second group

                if(arr[i] != arr[0]){ //start
                    System.out.print("From "+i+" to ");
                }

                else if (arr[i] != arr[i-1]){ //end of second group at i-1th position
                    System.out.println(i-1); //NOTE : here we consider i-1
                }

            }

        }

        if(arr[n-1] != arr[0]){
            System.out.println(n-1); //for case like :  0, 0, 1, 1, 0, 0, 1, 1, 0, 1. For the last element
        }

    }


}
