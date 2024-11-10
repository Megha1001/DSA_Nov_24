package recursion.subsetSumProblem;


/*
 * Logic : 
 * 1. Find all the subsets
 * 2. check the subset whose sum is equal to given sum
 * 
 * TIME COMPLEXITY : Theta(2^n)
 * AUXILIARY SPACE : Theta(N)
 */

public class FindSubsetCountEqualToGivenSumNaiveApproach {
    
    public static int sum = 0;

    public static void main(String args[]){
        int input[] ={10,5,2,3,6};
        int checkSum=8;
        System.out.println("Subsets with the given sum are : "+countSubsets(input, input.length,checkSum));
    }

    public static int countSubsets(int [] input, int n, int sum){

        if(n==0){
            return (sum==0)?1:0;
        }

        return countSubsets(input, n-1, sum) //not considering
        +
        countSubsets(input, n-1, sum-input[n-1]); //considering
        
    }

}
