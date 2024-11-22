package searching.squareRoot;

public class FindSquareRootNaiveApproach {
    
    public static void main(String args[]){
        int num = 19;
        System.out.println("Square root of given number is : "+findSqr(num));
    }

    public static int findSqr(int num){
        int i = 1;
        while(i*i <= num){
            ++i;
        }

        return i-1;
    }
    
}
