package searching.findPeakElement;

/*
 * Peak Element  : A peak element is an element which is greater than its neighbour
 */
public class FindPeakElementNaiveSolution {

    public static void main(String args[]){
        int arr[] = {6, 7, 8, 20, 12};
        System.out.println("The peak element in given array is : "+findPeakElement(arr, arr.length-1));
    }

    public static int findPeakElement(int arr[], int n){

        //base case
        if(n==1){
            return arr[0];
        }

        if(arr[0]>=arr[1]){
            return arr[0];
        }

        if(arr[n-1] >= arr[n-2]){
            return arr[n-1];
        }

        for(int i = 1; i <= n-2; i++){
            if(arr[i] <= arr[i-1] && arr[i] >= arr[i+1]){
                return arr[i];
            }
        }

        return -1;

    }
    
}
