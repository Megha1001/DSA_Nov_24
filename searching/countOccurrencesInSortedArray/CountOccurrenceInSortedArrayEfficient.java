package searching.countOccurrencesInSortedArray;

public class CountOccurrenceInSortedArrayIterative {
    public static void main(String args[]){
        int arr[] = {10,20,20,20,30,50};
        int x = 20;
        System.out.println("The occurrence of "+x+ " is "+countOccurrence(arr, 0, arr.length-1, x));
    }
}
