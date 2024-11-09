package recursion.ropeCuttingProblem;


/*
 * Time COMPLEXITY : It depends on a,b,c but we can find out upper bound complexity : O(3^n)
 * AUXILIARY SPACE : O(N), due to recursive call stack
 */

public class RopeCuttingProblemNaiveApproach {

    public static void main(String args[]){
        // int n=17,  a=10, b=11, c=3; o/p : 3
        int n=10,  a=9, b=7, c=11; //o/p : -1

        System.out.println("Max pieces that can be cut from rop of length N is : "+maxPieces(n, a, b, c));
    }

    public static int maxPieces(int n, int a, int b, int c){

        //base case
        if(n==0){
            return 0;
        }

        //base case
        if(n<=-1){
            return -1;
        }

        int res = Math.max(maxPieces(n-a, a, b, c), Math.max(maxPieces(n-b, a, b, c), maxPieces(n-c, a, b, c)));

        //important condition
        if(res==-1){
            return -1;
        }

        return res+1;

    }
    
}
