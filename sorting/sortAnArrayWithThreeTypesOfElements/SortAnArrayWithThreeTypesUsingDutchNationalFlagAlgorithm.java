package sorting.sortAnArrayWithThreeTypesOfElements;

/*
 * Logic : Use dutch National Flag Algorithm : Variation of Hoares, partition
 */

public class SortAnArrayWithThreeTypesUsingDutchNationalFlagAlgorithm {

    public static void main(String args[]){
        int arr[] = new int[]{2,2,1,2,0,1,1,2};
        System.out.println("Elements after partitioning is : ");
        int len = arr.length;
        segregateElements(arr, 0, len);

        for(int i : arr){
            System.out.print(i+ " ");
        }
    }


    public static void segregateElements(int arr[], int low, int n){

        int l0 = low, mid = low, high = n-1;

        while(mid <= high){

            switch(arr[mid]){

                case 0:
                    int temp = arr[l0];
                    arr[l0] = arr[mid];
                    arr[mid] = temp;
                    ++l0; ++mid; //NOTE : Here, we are incrementing both, since the only value possible that low can have is 0/1 hence we need to increase the boundaries of both. 
                    break;
                
                case 1:
                    ++mid;
                    break;
                
                case 2:
                    //swap mid and high
                    temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    --high;  // NOTE : Here, we are not incrementing mid since the value that mid get after swapping from high can be 0 or 1 that needs to be processed.
                    break;
                

            }

        }
    

    }
    
}
