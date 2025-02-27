package matrix.spiralPattern;

/*
 * TIME COMPLEXITY : Theta(R*C)
 * AUXILIARY SPACE : O(1)
 */

public class PrintMatrixInSpiralPattern {

    public static void main(String args[]){
        // int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        // int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int arr[][] = {// -> for this kind of input we need to have nested condition to check top<=bottom and left<=right inside while loop
            {1},
            {2},
            {3},
            {4},
            {5}
        };

        System.out.println("Elements of matrix after printing in spiral form are : ");
        printSpiralForm(arr);
    }

    public static void printSpiralForm(int arr[][]){
        int r = arr.length;
        int c = arr[0].length;

        int top = 0;
        int right = c-1;
        int bottom = r-1;
        int left = 0;

        while(left <= right && top <= bottom){

            //print top
            for(int i=left; i<=right; i++){
                System.out.print(arr[top][i]+ " ");
            }
            ++top;

            //print right
            for(int i=top; i<=bottom; i++){
                System.out.print(arr[i][right]+ " ");
            }
            --right;

            if(top <= bottom){
                //print bottom
                for(int i=right; i>=left; i--){
                    System.out.print(arr[bottom][i]+ " ");
                }
                --bottom;
            }
            

            if(left <= right){
                //print left
                for(int i=bottom; i>=top; i--){
                    System.out.print(arr[i][left]+ " ");
                }
                ++left;
            }
            

        }


    }
    
}
