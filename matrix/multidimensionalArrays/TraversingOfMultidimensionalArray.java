package matrix.multidimensionalArrays;

public class TraversingOfMultidimensionalArray {

    public static void main(String args[]){
        int arr[][] = {
                        {1, 2, 3, 4, 5, 6},
                        {10, 11, 12}
                    };
    
        for(int i=0 ; i<arr.length; i++){//arr.length given row. Here, 2;
            for(int j=0; j<arr[i].length;j++){ //arr[i].length -> number of column in ith row.
                System.out.print(arr[i][j]+ " ");
            }

        }
    }
    
}
