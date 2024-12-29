package hashing.unionOfTwoUnsortedArrays;

public class CountDistinctInTwoUnsortedArraysCombined {


    public static void main(String args[]){
        int a[] = {15,20,5,15};
        int b[] = {15,15,15,15,20,10};

        System.out.println("Number of distinct elements in given array combined is : "+countDistinct(a, b, a.length, b.length));
    }
    
}
