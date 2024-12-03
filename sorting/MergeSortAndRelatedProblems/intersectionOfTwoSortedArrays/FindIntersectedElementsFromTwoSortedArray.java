package sorting.MergeSortAndRelatedProblems.intersectionOfTwoSortedArrays;

/*
 * TIME COMPLEXITY : O(min(m,n))
 */

public class FindIntersectedElementsFromTwoSortedArray {

    public static void main(String args[]){
        int arr1 [] = {3, 5, 10, 10, 10, 15, 15, 20};
        int arr2 []= {5, 10, 10, 15, 30};

        System.out.println("Common elements in the given array is : ");
        findIntersection(arr1, arr2, arr1.length, arr2.length);
    }

    public static void findIntersection(int arr1[], int arr2[], int n1, int n2){

        int idx1 = 0;
        int idx2 = 0;

        while(idx1 < n1 && idx2 < n2){

            if((arr1[idx1] > arr2[idx2])|| (idx2 > 0 && arr2[idx2] == arr2[idx2-1])){
                ++idx2;
            }else if((arr1[idx1] < arr2[idx2]) || (idx1 > 0 && arr1[idx1] == arr1[idx1-1])){
                ++idx1;
            }
            else {
                System.out.print(arr1[idx1]+" ");
                ++idx1; ++idx2;
            }

        }

    }
    
}
