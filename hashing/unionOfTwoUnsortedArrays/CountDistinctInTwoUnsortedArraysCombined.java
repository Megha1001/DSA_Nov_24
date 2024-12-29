package hashing.unionOfTwoUnsortedArrays;

import java.util.HashSet;

public class CountDistinctInTwoUnsortedArraysCombined {


    public static void main(String args[]){
        int a[] = {15,20,5,15};
        int b[] = {15,15,15,15,20,10};

        System.out.println("Number of distinct elements in given array combined is : "+countDistinct(a, b, a.length, b.length));
    }
    

    public static int countDistinct(int a[], int b[], int n1, int n2){

        //AUXILIARY SPACE : O(N1+N2)
        HashSet<Integer> set = new HashSet<>();

        // Time Complexity : Theta(N1)
        for(int i=0; i<n1; i++){
            set.add(a[i]);
        }

        // Time Complexity : Theta(N2)
        for(int i=0; i<n2; i++){
            set.add(b[i]);
        }

        return set.size();

    }

}
