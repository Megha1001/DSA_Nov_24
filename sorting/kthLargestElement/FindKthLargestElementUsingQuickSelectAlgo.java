package sorting.kthLargestElement;

public class FindKthLargestElementUsingQuickSelectAlgo {
    public static void main(String args[]){
        int arr[] = {10, 5, 30, 12};
        int k = 2;

        System.out.println("The "+k+"th smallest number in given array is : "+findKthLargest(arr, 0, arr.length-1, arr.length-k));
    }



    public static int findKthLargest(int arr[], int low, int high, int k){

        while(low <= high){
            int p = partition(arr, low, high);

            if(p == k){
                return arr[p];
            }
            else if(p > k){
                high = p-1;
            }else{
                low = p+1;
            }
        }


        return -1;
    }


    public static int partition(int arr[], int low, int high){

        int i = low-1;
        int pivot = high;

        for(int j=low; j< high; j++){

            if(arr[j] < arr[pivot]){
                ++i;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }

        int temp = arr[i+1];
        arr[i+1] = arr[pivot];
        arr[pivot] = temp;


        return i+1;

    }

}
