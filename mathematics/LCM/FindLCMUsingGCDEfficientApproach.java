package mathematics.LCM;

/*
 * LOGIC :
 *  a*b = LCM(a,b) * GCD(a,b)
 * 
 * TIME COMPLEXITY : O(log(min(a,b))), same as what we have for Euclidean algorithm
 */

public class FindLCMUsingGCDEfficientApproach {
    public static void main(String args[]){
        int a=4, b=6;
        System.out.println("LCM of two given numbers is "+findLCM(a,b));
    }

    public static int findLCM(int a, int b){
         int multiple = a*b;
         int gcd = findGCD(a,b);

         return multiple/gcd;
    }

    //TIME COMPLEXITY : O(log(min(a,b)))
    public static int findGCD(int a, int b){
        if(b==0){
            return a;
        }

        return findGCD(b, a%b);
    }

    /* TIME COMPLEXITY : O(min(a,b))
     * public static int findGCD(int a, int b){
     *  
     *  while(a!=b){
     *  if(a>b){
     *      a=a-b;
     *  }else if( b>a){
     *      b=b-a;  
     *    }
     * }
     * return a;
     * 
     * }
     */

}
