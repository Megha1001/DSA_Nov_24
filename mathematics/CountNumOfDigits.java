package mathematics;

/*
 * TIME COMPLEXITY : Theta(d), where d is number of digits
 * AUXILIARY SPACE : Theta(1)
 */

class CountNumOfDigits{

    public static void main(String args[]){
        int input = 6783;
        System.out.println("Number of digits in given number : "+input+" is : "+countDigits(input));
    }

    public static int countDigits(int input){

        int count = 0;

        while(input != 0){
            ++count;
            input /= 10;
        }


        return count;
    }

}


/*
 * OUTPUT : 
 * Number of digits in given number : 6783 is : 4
 */