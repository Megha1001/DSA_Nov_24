package arrays.secondLargest;

/*
 * Naive Apporach : Find largest element index and then ignore it to find second largest element index
 * 
 * TIME COMPLEXITY : O(N), with 2 traversal of array 
 */

public class FindSecondLargestElementIndexNaiveApproach {


    public static void main(String args[]){
        int arr[] = {1,5,3,8,9,0,6,56,12,43};
        System.out.println("The idx of second largest element in given arrays is : "+findSecondLargestElementIdx(arr, arr.length));
    }


    public static int findSecondLargestElementIdx(int [] arr, int len){
        int res = -1;

        int idxLargest = getLargestElementIdx(arr, len);

        for(int i=0; i<len; i++){
            if(i!=idxLargest){
                if(res==-1){ //if we directly access without if condition it will give index not found something, arr[-1]
                    res=i;
                }else if(arr[i]>arr[res]){
                    res = i;
                }
            }
        }


        return res; //return -1, if not found
    }

    public static int getLargestElementIdx(int []arr, int len){
        int max = 0;
        for(int i=1; i<len; i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }

        return max;
    }

    
}
