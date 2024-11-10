package arrays;

/*
 * TIME COMPLEXITY : Theta(N)
 * AUXILIARY SPACE : Theta(1)
 */

public class FindMaximumElement {

    public static void main(String args[]){
        int arr[] = {1,5,3,8,9,0,6,56,12,43};
        System.out.println("The maximum element in given array is "+getLargest(arr, arr.length));
    }

    public static int getLargest(int arr[], int len){
        int max = arr[0];

        for(int i=1; i<len; i++){
            if(arr[i]>max){
                max= arr[i];
            }
        }

        return max;

    }
    
}
