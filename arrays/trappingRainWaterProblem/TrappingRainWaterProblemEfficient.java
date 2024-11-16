package arrays.trappingRainWaterProblem;

/*
 * TIME COMPLEXITY : Theta(N)
 * AUXILIARY SPACE : Theta(N)
 */

public class TrappingRainWaterProblemEfficient {
    public static void main(String args[]){
        int arr[] = {3, 0, 1, 2, 5};
        System.out.println("Maximum water that can be stored with given input is "+getWater(arr, arr.length));
    }


    public static int getWater(int arr[], int n){

        int res = 0;
        
        int lMax [] = new int[n];
        int rMax[] = new int[n];

        lMax[0] = arr[0];
        for(int i = 1; i < n; i++){
            lMax[i] = Math.max(lMax[i-1], arr[i]);
        }

        rMax[n-1] = arr[n-1];
        for(int i = n - 2; i >= 0; i--){
            rMax[i] = Math.max(rMax[i+1], arr[i]);
        }


        for(int i=0; i<n; i++){
            res+= Math.min(lMax[i], rMax[i]) - arr[i];
        }

        return res;

    }
}
