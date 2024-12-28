package matrix.spiralPattern;

/*
 * 
 */

public class PrintMatrixInSpiralPattern {

    public static void main(String args[]){
        // int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};

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

            //print bottom
            for(int i=right; i>=left; i--){
                System.out.print(arr[bottom][i]+ " ");
            }
            --bottom;

            //print left
            for(int i=bottom; i>=top; i--){
                System.out.print(arr[i][left]+ " ");
            }
            ++left;

        }


    }
    
}
