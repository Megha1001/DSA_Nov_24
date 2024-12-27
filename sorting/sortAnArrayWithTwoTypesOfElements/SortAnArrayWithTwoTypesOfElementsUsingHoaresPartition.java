package sorting.sortAnArrayWithTwoTypesOfElements;

public class SortAnArrayWithTwoTypesOfElementsUsingHoaresPartition {
    public static void main(String args[]){
        int arr[] = {13, -12, 18, -10, 10, -19};
        System.out.println("Array after partition is : ");
        segregatePosAndNeg(arr, 0, arr.length-1);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
