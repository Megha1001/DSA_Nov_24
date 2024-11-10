package arrays.secondLargest;


/*
 * LOGIC : 
 * arr[i] > arr[largest] => res = largest , largest=i;
 * arr[i]==arr[largest] => Ignore
 * arr[i]< arr[largest]
 *      -> res==-1 => res =i
 *      -> arr[i]>arr[res] => res=i
 *      -> arr[i]<arr[res] => ignorexx
 */

public class FindSecondLargestElementIndexEfficientApproach {

    public static void main(String args[]){
        int arr[] = {1,5,3,8,9,0,6,56,12,43};
        System.out.println("The idx of second largest element in given arrays is : "+findSecondLargestElementIdx(arr, arr.length));
    }

    public static int findSecondLargestElementIdx(int arr[], int len){
        int largest = 0, res=-1;

        for(int i=1; i<len; i++){
            if(arr[i]>arr[largest]){
                res = largest;
                largest = i;
            }

            else if(arr[i]!=arr[largest] && (res==-1 || arr[res]<arr[i])){ //res==-1 should be first condition
                res = i;
            }
        }

        return res;
    }

}
