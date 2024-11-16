package arrays.consecutiveOnes;

public class CountConsecutiveOneEfficientSolution {

    public static void main(String args[]){
        int arr[] = {0, 1, 1, 1, 1, 0};
        System.out.println("Consecutive 1's in given arrays is : "+findConsecutiveOne(arr, arr.length));
    }

    public static int findConsecutiveOne(int arr[], int n){
        int max = 0;
        int count=0;
        for(int i = 0; i < n; i++){
            if(arr[i]==1){
                ++count;
            }else{
                max = Math.max(max, count);
                count=0;
            }
            max = Math.max(max, count);
        }

        return max;
    }
    
}
