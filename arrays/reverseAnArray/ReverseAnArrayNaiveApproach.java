package arrays.reverseAnArray;


public class ReverseAnArrayNaiveApproach {
    
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5}; //odd size
        int arr1[] = {1,2,3,4,5,6}; //even size

        System.out.println("Arrays after getting reverse sorted");
        reverseSort(arr, arr.length);
        reverseSort(arr1, arr1.length);
    }

    public static void reverseSort(int arr[], int n){
        int start = 0;
        int end = n-1;
        int mid = (start+end)/2;

        //TIME COMPLEXITY : Theta(N/2)
        for(int i=0; i<=mid; i++){
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i] = temp;
        }

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();
    }

}
