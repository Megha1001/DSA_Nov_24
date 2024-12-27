package sorting.sortAnArrayWithThreeTypesOfElements;

/* */

public class SortAnArrayWithThreeTypesOfElementsUsingNaivePartitioningAlgo {

    public static void main(String args[]){
        int arr[] = {0, 1, 1, 2, 0, 1};
        int len = arr.length;

        System.out.println("Elements after partitioning is : ");
        segregateElements(arr, len);

        for(int i=0; i<len; i++){
            System.out.print(arr[i]+ " ");
        }
    }

    public static void segregateElements(int arr[], int n){

        int temp[] = new int[n];
        int idx = 0;

        for(int i=0; i<n; i++){
            if(arr[i]==0){
                temp[idx++] = arr[i];
            }
        }


        for(int i=0; i<n; i++){
            if(arr[i]==1){
                temp[idx++] = arr[i];
            }
        }

        for(int i=0; i<n; i++){
            if(arr[i]==2){
                temp[idx++] = arr[i];
            }
        }


        for(int i=0; i<n; i++){
            arr[i]= temp[i];
        }



    }
    
}
