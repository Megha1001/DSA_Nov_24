package hashing.intersectionOfTwoUnsortedArray;

import java.util.HashSet;


/*
 * Question : Print the intersection of two unsorted array and order should be the same in which its appearing in orginal array (1st one)
 * TIME COMPLEXITY : O(N),  2 traversal
 * AUXILIARY SPACE : O(N)
 * 
 * LOGIC : Convert the second array to HashSet and then traverse the first array to check whether its present in hashset or not
 *
 * We can also use Hashset
 * 
 */

public class FindIntersectionOfTwoUnsortedArrayUsingLinkedHashSetOptimized {
    
    public static void main(String args[]){
        int arr1[] = {10,15,20,25,30,50};
        int arr2[] = {30,5,15,80};

        System.out.println("Intersection elements in given arrays is/are : ");
        printIntersectionElements(arr1, arr2);

    }

    public static void printIntersectionElements(int arr1[], int arr2[]){

        //convert second array to LinkedHashSet
        HashSet<Integer> l2 = new HashSet<>();
        for(int i=0; i<arr2.length; i++){
            l2.add(arr2[i]);
        }

        for(int i=0; i<arr1.length; i++){
            if(l2.contains(arr1[i])){
                System.out.print(arr1[i]+" ");
            }
        }

    }
    
}
