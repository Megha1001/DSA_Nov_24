package mathematics.computingPower;

/*
 * LOGIC : The problem can be approached recursively defined by :
 *  power(x, n) = power(x, n/2) * power(x, n/2) , if n is even
 *  power(x, n) = x* power(x, n/2) * power(x, n/2), if n is odd
 * 
 * TIME COMPLEXITY : Theta(log(N))
 * AUXILIARY SPACE : Theta(log(N))
 */

public class ComputePowerEfficientApproach {

    public static void main(String args[]){
        int a=4, b=5;

        System.out.println("The value of 4^5 is : "+computePower(a, b));

    }

    public static int computePower(int a, int b){

        if(b==0){
            return 1;
        }

        int temp = computePower(a, b/2);
        temp = temp*temp;

        if(b%2==0){
            return temp;
        }else{
            return a*temp;
        }

    }
    
}
