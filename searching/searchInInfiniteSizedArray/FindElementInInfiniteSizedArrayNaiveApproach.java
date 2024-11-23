package searching.searchInInfiniteSizedArray;


public class FindElementInInfiniteSizedArrayNaiveApproach {

    public static void main(String args[]){
        int arr[] = {1,3,5,6,7,9,10,50,64,90};
        int x = 64;
        System.out.println("The element is present at : "+findElement(arr,x));
    }
    
}
