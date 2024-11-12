package arrays.moveZeroesToEnd;

/*
 * LOGIC : 
 * 1. Find the last non zero element index, keep a pointer there
 * 2. Traverse through the array, one we find element with value zero replace it with lastNonZeroIdx 
 * 3. decrement lastNonZeroIdx
 */

public class MoveZeroesToEndEffApproach {
    

    public static void main(String args[]){
        int arr[] = {1,4,2,0,0,8,7,0,3};
        System.out.println("After moving all zeroes to end, arrays is as follows : ");
        moveZeroesToEndAndPrintArray(arr, arr.length);
    }


    public static void moveZeroesToEndAndPrintArray(int arr[], int n){
        //find the last non zero idx'd element
        int lastNonZeroIdx=-1;
        for(int i=n-1; i>=0; i--){
            if(arr[i]!=0){
                lastNonZeroIdx = i;
                break;
            }
        }
        
        System.out.println("lastNonZeroIdx "+lastNonZeroIdx);

        for(int i=0; i<n;i++ ){
            if(arr[i]==0 && lastNonZeroIdx>=0 && arr[lastNonZeroIdx]!=0){
                int temp = arr[i];
                arr[i]= arr[lastNonZeroIdx];
                arr[lastNonZeroIdx] = temp;
                --lastNonZeroIdx;
            }
        }

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }

    }

}
