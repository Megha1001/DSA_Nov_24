package sorting.sortAnArrayWithThreeTypesOfElements;

public class SortAnArrayWithThreeTypesOfElementsUsingLomutoPartition {
    public static void main(String args[]){
        int arr[] = {0, 1, 1, 2, 0, 1};
        int len = arr.length;

        System.out.println("Elements after partitioning is : ");
        segregateElements(arr, 0 , len-1);

        for(int i=0; i<len; i++){
            System.out.print(arr[i]+ " ");
        }
    }

    public static void segregateElements(int arr[], int low, int high){

        int pivot = segregateTwoElements(arr, low, high, 0);
        segregateTwoElements(arr, pivot, high, 1);

    }

    public static int segregateTwoElements(int arr[], int low, int high, int elementToConsider){

        int i = low-1;
        int pivot = high;

        for(int j = low; j < high; j++){
            if(arr[j]== elementToConsider){
                ++i;
                //swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        //swap arr[i+1] and arr[pivot]
        int temp = arr[i+1];
        arr[i+1] = arr[pivot];
        arr[pivot] = temp;

        return i+1;
    }
}
