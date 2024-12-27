package matrix.snakePattern;

/*
 * TIME COMPLEXITY : O(M*N)
 * AUXILIARY SPACE : O(1)
 */
public class PrintMatrixInSnakePattern {

    public static void main(String args[]){
        int arr[][] = {
                        {1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}
                    };

        System.out.println("Element printed in snake pattern are :-");
        printInSnakePattern(arr);
    }

    public static void printInSnakePattern(int arr[][]){
        
        int r = arr.length;
        for(int i=0; i < r; i++){
            for(int j=0; j<arr[i].length; j++){
                if(i%2!=0){ //even , print R to L
                    System.out.print(arr[i][arr[i].length-1 - j]+" ");
                }else{
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }

    }
    
}
