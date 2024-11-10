package recursion.josephusProblem;

/*
 * Problem Statement : There are n people standing in a circle waiting to be executed. The counting out begins at some point in the circle and proceeds around the circle in a fixed direction.
 * In each step, a certain number of people are skipped and the next person is executed. The elimination proceeds around the circle(which is becoming smaller and smaller as the exectued people are removed),
 * until only the last person remains, who is given freedom.
 * 
 * Given the total number of persons n, and a number k which indicates that k-1 perosn s are skipped and kth person is killed in a circle. The task is to choose the place in the intial circle so that you are the last one remaining
 * and so survive.
 * 
 * LOGIC :
 *  Let say n=7, k=3
 *  First we kill person with index = 2
 *     After that
 *          3->0
 *          4->1
 *          5->2
 *          6->3
 *          0->4
 * 
 * 5->2 => if we get 2 by smaller funtion we need to convert it to 5=> 5 is nothing but (2+k)%n
 * 
 * TIME COMPLEXITY : Theta(N)
 * AUXILIARY SPACE : Theta(N)
 * 
 * Extension : If the position begins from 1 instead of 0
 *  Change : System.out.println("The chosen place is : "+josephus(n, k)+1); //Just add 1 to final output
 */

public class JosephusProblem {

    public static void main(String args[]){
        int n=7, k=3;
        System.out.println("The chosen place is : "+josephus(n, k));
    }

    //Returns values from 0->n-1
    public static int josephus(int n, int k){

        if(n==1){
            return 0;
        }

        return (josephus(n-1,k) + k)%n;

    }
    
}
