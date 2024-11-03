package mathematics.GCD;

public class FindGCDUsingEuclideanAlgo {
    public static void main(String args[]){
        int a = 9, b = 10;
        System.out.println("GCD of given numbers is "+findGCD(a, b));
    }

    public static int findGCD(int a, int b){
        
        while(a!=b){
            if(a>b){
                a=a-b;
            }else{
                b=b-a;
            }
        }

        return a;
    }
}
