package matrix.transposeOfMatrix;

/*
 * TIME COMPLEXITY : O(R*C)
 * AUXILIARY SPACE : O(1)
 * 
 * In place approach.
 */

public class PrintTransposeOfMatrixUsingEfficientApproach {
    
    public static void main(String args[]){
        int arr[][] = {
                        {1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}
                    };
        
        System.out.println("Transpose of the matrix is : ");
        printTranspose(arr);

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }


    public static void printTranspose(int arr[][]){

        int n = arr.length; //Assuming, its a square matrix

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                //swap
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

    }
}
