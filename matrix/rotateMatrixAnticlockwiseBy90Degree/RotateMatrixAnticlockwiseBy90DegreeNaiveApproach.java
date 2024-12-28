package matrix.rotateMatrixAnticlockwiseBy90Degree;

/*
 * LOGIC 
 * 1. we need to assign : temp[i][j] = arr[j][n-1-i]
 * 
 * 
 * 00->02
 * 01->12
 * 02->22
 * ------
 * 10->01
 * 11->11
 * 12->21
 * ------
 * 20->00
 * 21->10
 * 22->20
 * 
 * TIME COMPLEXITY : O(N*N)
 * AUXILIARY COMPLEXITY : O(N*N)
 */

public class RotateMatrixAnticlockwiseBy90DegreeNaiveApproach {

    public static void main(String args[]){
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};

        System.out.println("Matrix elements after rotating by 90 degree are : ");
        rotateBy90DegreeAnticlockwise(arr);


        for(int i=0; i<arr.length; i++){
            for(int j=0; j< arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void rotateBy90DegreeAnticlockwise(int arr[][]){
        int n = arr.length; //Assuming square matrix!!

        int tempArr[][] = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j = 0; j<n; j++){
                //swap
                tempArr[i][j] = arr[j][n-1-i];
            }
        }


        for(int i=0; i<n; i++){
            for(int j = 0; j<n; j++){
                arr[i][j] = tempArr[i][j];
            }
        }

    }
    
}
