package searching.findRepeatingElement;

/*
 * Logic : Use Hare and tortoise algo --> This is for elements where smallest elemlent is 1 not zero
 * If we had 0 then cycle will not go anywhere 0->0->0---> self loop
 */
public class FindFirstRepeatingElementEfficientAppUsingHareAndTortoiseSmallestElement1 {

    public static void main(String args[]){
        int arr[] = {1, 3, 2, 4, 6, 5, 7, 3};
        System.out.println("The repeating element is : "+findRepeating(arr, arr.length));
    }
    

    public static int findRepeating(int arr[], int n){
        int slow = arr[0];
        int fast = arr[0];

        //have to run once since they start from same place
        do{
            slow = arr[slow];
            fast = arr[arr[fast]];
        }while(slow != fast);

        slow = arr[0];

        while(slow != fast){
            slow = arr[slow];
            fast = arr[fast];
        }

        return fast; //return slow;

    }

}
