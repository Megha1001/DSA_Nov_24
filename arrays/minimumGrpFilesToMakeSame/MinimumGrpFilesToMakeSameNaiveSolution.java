package arrays.minimumGrpFilesToMakeSame;

/*
 * LOGIC : 
 * 1. count grps of 1's and 0's
 * 2. compare oneGrp, zeroGrp 
 * 3. if oneGrp < zeroGrp
 *      print for oneGrp
 *  else
 *      print for zeroGrp
 */

public class MinimumGrpFilesToMakeSameNaiveSolution {

    public static void main(String args[]){
        // int arr[] = {1, 1, 0, 0, 0, 0};
        // int arr[] = {1, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1};
        // int arr[] = {1,1,1,1};
        int arr[] = {0, 1};

        System.out.println("Minimum group files to make array same are : ");
        printMinimumGrpFlips(arr, arr.length);
    }


    public static void printMinimumGrpFlips(int arr[], int n){
        int oneGrp = 0, zeroGrp = 0;

        if(arr[0] == 0){
            ++zeroGrp;
        }else{
            ++oneGrp;
        }

        for(int i = 1; i < n; i++){

            if(arr[i]==1 && arr[i-1] == 0){
                ++oneGrp;
            } else if (arr[i] == 0 && arr[i-1] ==1 ){
                ++zeroGrp;
            }

        }

        int consider = oneGrp < zeroGrp ? 1 : 0;
        int count = oneGrp < zeroGrp ? oneGrp : zeroGrp;

        if(arr[0] == consider){
            System.out.print("From "+0);
        }

        // int arr[] = {1, 1, 0, 0, 0, 1};
        
        while(count > 0){

            for(int i = 1; i < n; i++){
                if(arr[i] == consider && arr[i-1] != consider){
                    //start
                    System.out.print("From "+i);
                } else if(arr[i] == consider && (i+1) == n-1 && arr[i+1] != consider){  // when we have case like 1,1,0,0,0,1 --> and need to find out last 0 occurrence in grp
                    System.out.println(" To "+i);
                    --count;
                } else if(arr[i] == consider && (i+1) == n-1 && arr[i+1] == consider){// when we have case like 1,1,0,0,0,0 --> and need to find out last 0 occurrence in grp
                    System.out.println(" To "+(i+1));
                    --count;
                } else if(arr[i] == consider && (i+1) != n && (i+1) != n-1 && arr[i+1] != consider){
                    System.out.println(" To "+i);
                    --count;
                }
            }

        }
    

    }


    
}
