package matrix.RowWiseAndColumnWiseSortedMatrix;

/*
 * We have given a matrix of row and column wise sorted. The task is to find out the element in that matrix. If present, return "found" if not return "Not Found"
 * 
 * Idea : 
 *  The can be solved by two ways
 *  1. Considering top-right element as start
 *         ->if(top-right == x) return
 *         -> else if top-right > x then go to left
 *         -> else go to right
 *  2. Considering bottom left element as star
 *         ->if(bottom-left == x) return
 *         -> else if bottom-left > x then go up
 *         -> else go down
 */

public class FindElementInRowWiseAndColumnWiseSortedMatrix {

    public static void main(String args[]){
        int mat[][] = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int x = 29;
    }
    
}
