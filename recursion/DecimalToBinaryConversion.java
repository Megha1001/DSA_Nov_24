package recursion;
/*
 * LOGIC : to convert decimal to binary we divide the number by 2 and keep storing its module with 2 and we divide until we get 0. then we write stored
 * module in reverse order.
 * 
 * TIME COMPLEXITY : Theta(log(N))
 * AUXILIARY SPACE : Theta(log(N))
 */

public class DecimalToBinaryConversion {

    public static void main(String args[]){
        int n = 13;
        System.out.println("The decimal to binary conversion for given number will be : ");
        printDecimalToBinary(n);
    }

    public static void printDecimalToBinary(int n){
       
        //base condition
        if(n==0){
            return;
        }

        printDecimalToBinary(n/2);
        System.out.print(n%2); //after recursive call to read from last ;)

    }
    
}
