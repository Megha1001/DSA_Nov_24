package recursion.towerOfHanoi;

/*
 * RULES : 
 * 1. Only one disc moves at a time
 * 2. No larger disc above smaller
 * 3. Only the top disc of a tower can be moved.
 * 
 * TIME COMPLEXITY : Theta(2^n) = Number of calls made = Number of moments needed
 *  Other way to understand : There are two possilities for every disc(basically every disc has two position to move to , for ex if we have A , 
 * it can move to B or C)
 * AUXILIARY SPACE : O(N), Function call stack space
 */

public class MoveDiscUsingRecursion {


    public static void main(String args[]){

        int n = 3;
        System.out.println("To move 3 disc from A to C follow below steps : ");
        TOH(n, 'A', 'B', 'C');

    }
    
    public static void TOH(int n , char A, char B, char C){ // A -> source, B -> Auxiliary tower(extra tower), C -> destination

        // base condition
        if(n==1){
            System.out.println("Move disc 1 from "+A+" to "+C);
            return;
        }

        TOH(n-1, A, C ,B); // Move n-1 disc from A to B using C as an auxiliary tower
        System.out.println("Move disc "+(n)+" from "+A+" to "+C);
        TOH(n-1, B, A, C); // Move n-1 disc from B to C using A as an auxiliary tower
    }
    
}
