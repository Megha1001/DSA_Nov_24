package hashing.moreThanNByKOccurrences;

public class PrintElementsWithMoreThanNByKOccurrences {


    public static void main(String args[]){
        int arr[] = {30,10,20,20,10,20,30,30};
        int k = 4;

        System.out.println("Elements with occurrence more than n/k are : ");
        printElementsWithMoreThanNByKOccurrence(arr, arr.length, k);
    }
    
}
