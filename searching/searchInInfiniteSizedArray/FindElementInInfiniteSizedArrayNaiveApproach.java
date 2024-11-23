package searching.searchInInfiniteSizedArray;

/*
 * TIME COMPLEXITY : O(position)
 * AUXILIARY SPACE : Theta(1)
 */

public class FindElementInInfiniteSizedArrayNaiveApproach {

    public static void main(String args[]){
        int arr[] = {1,3,5,6,7,9,10,50,64,90};
        int x = 64;
        System.out.println("The element is present at : "+findElement(arr,x));
    }
    

    public static int findElement(int arr[], int x){
        int i = 0;
        while(true){
            if(arr[i]==x){
                return i;
            }else if(arr[i]>x){
                return -1;
            }
            ++i;
        }
    }

}
