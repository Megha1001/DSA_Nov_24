package sorting.buildInFunctions;

import java.util.Arrays;

public class ArraysSortFunctionExample {

    public static void main(String args[]){
        int arr1[] = {5, 20, 12, 30};
        char arr2[] = {'B', 'B', 'A', 'C', 'A'};

        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));


        int arr3[] = {5, 30, 20, 10, 8};
        Arrays.sort(arr3, 1, 4); //end index is not included
        System.out.println(Arrays.toString(arr3));
    }
    
}
