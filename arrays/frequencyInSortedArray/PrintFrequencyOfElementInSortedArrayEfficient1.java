package arrays.frequencyInSortedArray;

/*
 * TIME COMPLEXITY : Theta(N)
 * AUXILIARY SPACE : Theta(1)
 */

public class PrintFrequencyOfElementInSortedArrayEfficient1 {

    public static void main(String args[]){
        int arr[] = {10,10,10,20,20,20,20,30,40,50};
        System.out.println("Frequency of element in sorted array are : ");
        findAndPrintFreq(arr, arr.length);
    }
    

    public static void findAndPrintFreq(int arr[], int n){
        int freq=1;

        for(int i=1;i<n;i++){
            if(arr[i]==arr[i-1]){
                ++freq;
            }else{
                System.out.println(arr[i-1]+":"+freq);
                freq=1;
            }
        }

        //for last element
        System.out.println(arr[n-1]+":"+freq);

    }

}
