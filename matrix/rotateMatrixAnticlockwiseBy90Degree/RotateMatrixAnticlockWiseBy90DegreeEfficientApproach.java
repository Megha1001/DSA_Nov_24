package matrix.rotateMatrixAnticlockwiseBy90Degree;


/* 
 * LOGIC : 
 * 1. Find transpose of matrix
 * 2. reverse individual columns
 * 
*/

public class RotateMatrixAnticlockWiseBy90DegreeEfficientApproach {
    public static void main(String args[]){
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};

        System.out.println("Matrix elements after rotating by 90 degree are : ");
        rotateBy90DegreeAnticlockwise(arr);
        System.out.println("----------------");

        for(int i=0; i<arr.length; i++){
            for(int j=0; j< arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }


    public static void rotateBy90DegreeAnticlockwise(int arr[][]){
        int n = arr.length; //Assuming square matrix
        findTranspose(arr);

        //reverse individual columns
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                //swap
                System.out.println(arr[j][i] + "<->"+arr[n-1-i][i]);
                System.out.println(arr[j][i] + "<->"+arr[n-1-i][i]);
                int temp = arr[j][i];
                arr[j][i] = arr[n-1-i][i];
                arr[n-1-i][i] = temp;
            }
        }

    }

    public static void findTranspose(int arr[][]){
        int n = arr.length;
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
