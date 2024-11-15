package arrays.trappingRainWaterProblem;

public class TrappingRainWaterProblemNaive {

    public static void main(String args[]){
        int arr[] = {3, 0, 1, 2, 5};
        System.out.println("Maximum water that can be stored with given input is "+getWater(arr, arr.length));
    }
    
}
