package searching.searchInSortedRotatedArray;

public class FindElementInSortedRotatedArrayUsingBinarySearch {

    public static void main(String args[]){
        int [] arr = {100, 500, 10, 20, 30, 40};
        int x = 500;
        System.out.println("Element is present in given array at location : "+searchInSortedRotatedArray(arr, arr.length, x));
    }
    
}
