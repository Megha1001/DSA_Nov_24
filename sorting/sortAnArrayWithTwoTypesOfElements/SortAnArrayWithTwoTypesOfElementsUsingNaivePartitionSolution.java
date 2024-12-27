package sorting.sortAnArrayWithTwoTypesOfElements;

/*
 * Segregate elements that has two types of elements
 * 1. Segregate negative and positive elements
 * 2. segregate even and odd elements
 * 3. Sort a binary array(containing 0's and 1's)
 * 
 * Logic : Use Naive approach of quick Sort partition.
 * 
 * TIME COMPLEXITY : Theta(N), 3 traversal
 * AUXILIARY SPACE : Theta(N)
 */


public class SortAnArrayWithTwoTypesOfElementsUsingNaivePartitionSolution {

    public static void main(String args[]){
        int arr[] = {13, -12, 18, -10};
        System.out.println("Array after partition is : ");
        segregatePosAndNeg(arr, arr.length);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }


    public static void segregatePosAndNeg(int arr[], int n){

        int temp[] = new int[n];
        int idx = 0;

        for(int i=0; i<n; i++){
            if(arr[i] < 0){
                temp[idx++] = arr[i];
            }
        }

        for(int i=0; i<n; i++){
            if(arr[i] >=0){
                temp[idx++] = arr[i];
            }
        }

        for(int i=0; i<n; i++){
            arr[i] = temp[i];
        }


    }
    
}
