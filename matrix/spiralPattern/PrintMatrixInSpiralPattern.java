package matrix.spiralPattern;

public class PrintMatrixInSpiralPattern {

    public static void main(String args[]){
        int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

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


        
    }
    
}
