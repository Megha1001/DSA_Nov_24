package sorting.kthSmallestElement;

/*
 * Logic 
 * 1. sort the array using selectionSort
 * 2. 
 */

public class FindKthSmallestElementNaiveApproach {

    public static void main(String args[]){
        int arr[] = {10, 5, 30, 12};
        int k = 3;

        System.out.println("The "+k+"th smallest number in given array is : "+findKthSmallestNumber(arr, k));
    }


    public static int findKthSmallestNumber(int arr[], int k){

        int min = arr[0];
        int count = 0;
        int l = -1;


        for(int i=0; i<k; i++){
            for(int j = 0; j < arr.length; i++){
                ++count;
                if(arr[i] < min){
                    min = arr[i];
                    l = j;
                }

                if(count==k){
                    break;
                }
            }

            //swap
            int temp = arr[i];
            arr[i] = arr[l];
            arr[l]= temp;
        }

        for(int i=0; i< arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        

        return arr[1];
    }
    
}
