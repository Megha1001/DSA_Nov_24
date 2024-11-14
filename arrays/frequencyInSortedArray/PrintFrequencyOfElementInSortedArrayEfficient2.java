package arrays.frequencyInSortedArray;

/*
 * TIME COMPLEXITY : Theta(N) --> This is Theta(N)
 * AUXILIARY SPACE : Theta(1)
 */

public class PrintFrequencyOfElementInSortedArrayEfficient2 {

    public static void main(String args[]){
        int arr[] = {10,10,10,20,20,20,20,30,40,50};
        System.out.println("Frequency of element in sorted array are : ");
        findAndPrintFreq(arr, arr.length);
    }


    public static void findAndPrintFreq(int arr[], int n){
       
        int freq=1, i=1;

        while(i<n){

            while(i<n && arr[i]==arr[i-1]){
                ++freq;
                ++i;
            }
            System.out.println(arr[i-1]+":"+freq);
            freq=1;
            ++i; // this is necessary as we have already considered freq=1 for next element.
        }
    }

}
