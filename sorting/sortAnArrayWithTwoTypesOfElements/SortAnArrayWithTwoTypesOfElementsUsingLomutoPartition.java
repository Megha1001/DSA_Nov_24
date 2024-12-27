package sorting.sortAnArrayWithTwoTypesOfElements;

public class SortAnArrayWithTwoTypesOfElementsUsingLomutoPartition {
    
    public static void main(String args[]){
        int arr[] = {13, -12, 18, -10, 10, -19};
        System.out.println("Array after partition is : ");
        segregatePosAndNeg(arr, 0, arr.length-1);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void segregatePosAndNeg(int arr[], int low, int high){

        int i = low-1;
        int pivot = high;
        
        for(int j=low; j<high; j++){
            if(arr[j]< 0){
                ++i;
                //swap arr[i] & arr[j]
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j] = temp;
            }
        }

        //swap arr[i+1] and arr[pivot]
        int temp = arr[i+1];
        arr[i+1] = arr[pivot];
        arr[pivot] = temp;

    }

}
