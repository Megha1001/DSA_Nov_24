package arrays.findLeaders;

/*
 * Leader : An element is a leader if its greater than all the elements to its right side.
 * Logic : Last one would always be a leader. Maintain a lastLeader and traverse from right to left. update lastLeader if we found new leader and traverse if we found arr[i] > arr[leader] update leader else continue;
 */
public class FindLeaderInArrayEfficientApproach {

    public static void main(String args[]){
        int arr[] = {7,10,4,3,6,5,2};
        System.out.println("The leaders of the given arrays is/are : ");
        findAndPrintLeaders(arr, arr.length);
    }


    public static void findAndPrintLeaders(int arr[], int n){
        int currLeader = arr[n-1]; //last element is always a leader
        System.out.print(currLeader+" ");


        for(int i=n-2;i>=0; i--){
            if(arr[i]>currLeader){
                currLeader = arr[i];
                System.out.print(currLeader+" ");
            }
        }

    }
    
}
