package sorting.MergeSortAndRelatedProblems.intersectionOfTwoSortedArrays;

public class FindIntersectedElementsFromTwoSortedArrayEasyImpl {
    
    public static void main(String args[]){
        int arr1 [] = {3, 5, 10, 10, 10, 15, 15, 20};
        int arr2 []= {5, 10, 10, 15, 30};

        System.out.println("Common elements in the given array is : ");
        findIntersection(arr1, arr2, arr1.length, arr2.length);
    }

}
