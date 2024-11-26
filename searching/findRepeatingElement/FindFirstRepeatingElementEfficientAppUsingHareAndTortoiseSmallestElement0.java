package searching.findRepeatingElement;

/*
 * Logic : Use Hare and tortoise algo --> This is for elements where smallest elemlent is 1 not zero
 */
public class FindFirstRepeatingElementEfficientAppUsingHareAndTortoiseSmallestElement0 {

    public static void main(String args[]){
        int arr[] = {0,1, 3, 2, 4, 6, 5, 7, 3};
        System.out.println("The repeating element is : "+findRepeating(arr, arr.length));
    }
    

    public static int findRepeating(int arr[], int n){
        int slow = arr[0] + 1;
        int fast = arr[0] + 1;

        //have to run once since they start from same place
        do{
            slow = arr[slow] + 1;
            fast = arr[arr[fast] + 1] + 1;
        }while(slow != fast);

        slow = arr[0] + 1;

        while(slow != fast){
            slow = arr[slow] + 1;
            fast = arr[fast] + 1;
        }

        return fast-1; //return slow;

    }

}
