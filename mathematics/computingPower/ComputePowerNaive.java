package mathematics.computingPower;


/*
 * TIME COMPLEXITY : Theta(B)
 */

public class ComputePowerNaive {

    public static void main(String args[]){
        int a=3 , b=4;
        System.out.println("The value of 3^4 is : "+computePower(a, b));
    }

    public static int computePower(int a, int b){
        int res = 1;

        for(int i=0; i<b; i++){
            res *= a;
        }

        return res;
    }
    
}
