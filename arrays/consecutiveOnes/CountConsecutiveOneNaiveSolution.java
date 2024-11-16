package arrays.consecutiveOnes;

public class CountConsecutiveOneNaiveSolution {

    public static void main(String args[]){
        // int arr[] = {1, 0, 0, 0, 0};
        // int arr[] = {0, 1, 1, 0, 1, 0};
        // int arr[] = {1, 1, 1, 1, 1};
        // int arr[] = {0, 0, 0, 0, 0};
        int arr[] = {1, 0, 1, 1, 1, 1, 0, 1, 1};

        System.out.println("Maximum consecutive 1's in given array is "+countConsecutiveOnes(arr, arr.length));
    }

    public static int countConsecutiveOnes(int arr[], int n){
        int max = 0;

        for(int i=0; i<n; i++){
            if(arr[i] == 1){
                int count = 1;
                for(int j = i + 1; j < n; j++){
                    if(arr[j] == 1 && arr[j] == arr[j-1]){
                        //consecutive
                        ++count;
                    }else{
                        max = Math.max(max, count);
                        count=1;
                    }
                    max = Math.max(max, count);
                }
                
            }
        }
        
        return max;
    }
    
}
