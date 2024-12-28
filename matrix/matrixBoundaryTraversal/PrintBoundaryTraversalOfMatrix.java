package matrix.matrixBoundaryTraversal;
/*
 * TIME COMPLEXITY : O(Max(M,N))  | 4 traversal
 * AUXILIARY SPACE : O(1)
 */

public class PrintBoundaryTraversalOfMatrix {

    public static void main(String args[]){

        // int arr[][] = {
        //             {1,2,3,4},
        //             {5,6,7,8},
        //             {9,10,11,12},
        //             {13,14,15,16}
                // };
        int arr[][] = {
            {1},
            {5},
            {9},
            {13}
        };
        
        /* int arr[][] = {
            {1,2,3,4},
            // {5,6,7,8},
            // {9,10,11,12},
            // {13,14,15,16}
        }; */      
        System.out.println("The boundary traversal of given matrix is :");
        printBoundaryTraversal(arr);

    }
    

    public static void printBoundaryTraversal(int arr[][]){
        int row = arr.length;
        
        /*
         * 1st row (L to R)
         * last column ( top to bottom )
         * last row ( R to L)
         * first column (bottom to Top )
         */

        //special handling for 1 row or 1 column
        if(row==1){
            for(int i=0; i<arr[0].length; i++){
                System.out.print(arr[0][i]+ " ");
            }
        }


        else if(arr[0].length==1){
            for(int i=0; i<row; i++){
                System.out.print(arr[i][0]+ " ");
            }
        }

        else{
            //first row -> L to R
            for(int i = 0; i < arr[0].length; i++){
                System.out.print(arr[0][i]+ " ");
            }


            //last column -> top to bottom
            for(int i = 1; i < row; i++){
                System.out.print(arr[i][row-1]+ " ");
            }

            //last row -> R to L
            for(int i = arr[row-1].length -2; i>=0; i--){
                System.out.print(arr[row-1][i]+ " ");
            }

            //first column -> bottom to top
            for(int i = row-2; i>=1; i--){
                System.out.print(arr[i][0]+" ");
            }
        }

    }

}
