package sorting.sortAnArrayWithThreeTypesOfElements;

public class SortAnArrayWithThreeTypesOfElementsUsingHoaresPartition {
    
    public static void main(String args[]){
        int arr[] = {0, 1, 1, 2, 0, 1};
        int len = arr.length;

        System.out.println("Elements after partitioning is : ");
        segregateElements(arr, 0 , len-1);

        for(int i=0; i<len; i++){
            System.out.print(arr[i]+ " ");
        }
    }

    
}
