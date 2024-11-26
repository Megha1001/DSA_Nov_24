package searching.medianOfTwoSortedArray;

/*
 * LOGIC : Use merge sort logic
 * 
 * TIME COMPLEXITY : O(N1+ N2)
 * AUXILIARY SPACE : Theta(N1+N2)
 */

public class FindMedianOfTwoSortedArrayNaiveSolution {
    
    public static void main(String args[]){
        int arr1 [] = {10, 20 , 30, 40, 50};
        int arr2 [] = {5, 15, 25, 35, 45};
        // int arr1 [] = {1, 2 , 3, 4};
        // int arr2 [] = {5, 15, 25, 35, 45};
        System.out.println("The median for two sorted array is "+findMedian(arr1, arr2, arr1.length, arr2.length));
    }

    public static float findMedian(int arr1[], int arr2[], int n1, int n2){
        float temp[] = new float[n1+n2];
        int i = 0; //for first array
        int j = 0; //for second array
        int idx = 0; //for temp array

        while(i < n1 && j < n2){
            if(arr1[i] > arr2[j]){
                
                temp[idx++] = arr2[j++];
            }

            else if(arr1[i] < arr2[j]){
                temp[idx++] = arr1[i++];
            }

            else {
                temp[idx++] = arr1[i++];
                temp[idx++] = arr2[j++];
            }

        }
        
        //array 1 has remaining elements
        while(i < n1){
            temp[idx++] = arr1[i++];
        }



        //array 2 has remaining elements
        while(j < n2){
                temp[idx++] = arr2[j++];
        }

        for(int k=0; k< temp.length; k++){
            System.out.print(temp[k]+" ");
        }
        
        if(temp.length %2 == 0){
            return (temp[temp.length/2-1] + temp[temp.length/2])/2;
        }

        return temp[temp.length/2];
    }
    
}
