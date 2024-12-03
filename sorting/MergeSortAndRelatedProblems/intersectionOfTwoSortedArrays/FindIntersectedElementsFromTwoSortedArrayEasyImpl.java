package sorting.MergeSortAndRelatedProblems.intersectionOfTwoSortedArrays;

public class FindIntersectedElementsFromTwoSortedArrayEasyImpl {
    
    public static void main(String args[]){
        int arr1 [] = {3, 5, 10, 10, 10, 15, 15, 20};
        int arr2 []= {5, 10, 10, 15, 30};

        System.out.println("Common elements in the given array is : ");
        findIntersection(arr1, arr2, arr1.length, arr2.length);
    }

    public static void findIntersection(int a[], int b[], int m, int n){
        int i = 0, j = 0;
        while(i < m && j < n){
            if(i > 0 && a[i] == a[i-1]){
                i++; continue;
            }
            if(a[i] < b[j]){
                ++i;
            }else if(a[i] > b[j]){
                ++j;
            }else {
                System.out.print(a[i]+" ");
                ++i;
                ++j;
            }
        }

    }

}
