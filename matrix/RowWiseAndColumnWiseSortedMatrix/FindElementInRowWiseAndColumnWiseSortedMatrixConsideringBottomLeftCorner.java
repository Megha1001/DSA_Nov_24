package matrix.RowWiseAndColumnWiseSortedMatrix;

/*
 * We have given a matrix of row and column wise sorted. The task is to find out the element in that matrix. If present, return "found" if not return "Not Found"
 * 
 * Idea : 
 *  The can be solved by two ways
 *  1. Considering top-right element as start
 *         ->if(top-right == x) return
 *         -> else if top-right > x then go to left
 *         -> else go to down
 *  2. Considering bottom left element as star
 *         ->if(bottom-left == x) return
 *         -> else if bottom-left > x then go up
 *         -> else go right
 */

public class FindElementInRowWiseAndColumnWiseSortedMatrixConsideringBottomLeftCorner {

    public static void main(String args[]){
        int mat[][] = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int x = 20;

        System.out.println("is the element "+x+" present in given matrix ?"+checkIfElementPresent(mat, x));
    }


    public static boolean checkIfElementPresent(int arr[][], int x){
        int row = arr.length;
        int column = arr[0].length;

        //corner case
        if(arr[row-1][column-1] < x){
            return false;
        }

    
        int i = 0, j= column-1;

        while(i < row && j>=0 ){
            if(arr[i][j]==x){
                return true;
            }else if(arr[i][j] > x){
                //go to left
                --j;
            }else{
                //go down
                ++i;
            }
        }

        return false;

    }
    
}
