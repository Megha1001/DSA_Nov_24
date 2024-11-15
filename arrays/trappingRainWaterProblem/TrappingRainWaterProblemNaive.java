package arrays.trappingRainWaterProblem;

/*
 * TIME COMPLEXITY : Theta(N^2)
 * AUXILIARY SPACE : Theta(1)
 */

public class TrappingRainWaterProblemNaive {

    public static void main(String args[]){
        int arr[] = {3, 0, 1, 2, 5};
        System.out.println("Maximum water that can be stored with given input is "+getWater(arr, arr.length));
    }
    


    public static int getWater(int arr[] , int n){
        int res = 0;

        // We can't store water on first and last pillar as there is no support
        for(int i = 1; i < n-1; i++){

            int lMax = arr[i];
            for(int j = 0; j < i; j++){
                lMax = Math.max(lMax, arr[j]);
            }

            int rMax = arr[i];
            for(int j = i+1; j < n; j++){
                rMax = Math.max(rMax, arr[j]);
            }


            res += Math.min(lMax, rMax) - arr[i];

        }

        return res;
    }

}
