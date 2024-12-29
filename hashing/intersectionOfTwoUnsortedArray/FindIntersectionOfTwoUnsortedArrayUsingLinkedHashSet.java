package hashing.intersectionOfTwoUnsortedArray;

import java.util.LinkedHashSet;
import java.util.Iterator;


/*
 * Question : Print the intersection of two unsorted array and order should be the same in which its appearing in orginal array (1st one)
 */

public class FindIntersectionOfTwoUnsortedArrayUsingLinkedHashSet {
    
    public static void main(String args[]){
        int arr1[] = {10,15,20,25,30,50};
        int arr2[] = {30,5,15,80};

        System.out.println("Intersection elements in given arrays is/are : ");
        printIntersectionElements(arr1, arr2);

    }

    public static void printIntersectionElements(int arr1[], int arr2[]){

        //convert first array to LinkedHashSet
        LinkedHashSet<Integer> l1 = new LinkedHashSet<>();
        for(int i=0; i<arr1.length; i++){
            l1.add(arr1[i]);
        }

        //convert first array to LinkedHashSet
        LinkedHashSet<Integer> l2 = new LinkedHashSet<>();
        for(int i=0; i<arr2.length; i++){
            l2.add(arr2[i]);
        }

        Iterator<Integer> i1 = l1.iterator();

        while(i1.hasNext()){
            int temp = i1.next();
            if(l2.contains(temp)){
                System.out.print(temp + " ");
            }

        }

    }
    
}
