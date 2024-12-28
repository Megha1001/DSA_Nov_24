package matrix.transposeOfMatrix;

/*
 * TIME COMPLEXITY : O(M*N)
 * AUXILIARY SPACE : O(M*N)
 * Not in place
 */

public class PrintTransposeOfMatrixUsingNaiveApproach {

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

        int temp[][] = new int[arr.length][arr.length]; //assuming the square matrix

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                temp[i][j] = arr[j][i];
            }
        }

        //copying to original array
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                arr[i][j] = temp[i][j];
            }
        }

    }
    
}
