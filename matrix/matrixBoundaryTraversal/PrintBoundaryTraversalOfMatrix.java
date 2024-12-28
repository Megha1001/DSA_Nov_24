package matrix.matrixBoundaryTraversal;

public class PrintBoundaryTraversalOfMatrix {

    public static void main(String args[]){

        int arr[][] = {
                    {1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16}
                };
        
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




    }

}
