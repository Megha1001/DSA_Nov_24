package sorting.MeetingTheMaximumGuest;

import java.util.Arrays;

/*
 * TIME COMPLEXITY : O(nLogN)
 */

public class FindTheMaximumGuestWeCanMeet {

    public static void main(String args[]){
        int arrival[] = {900, 600, 700};
        int departure[] = {1000, 800, 730};

        /*
         * Idea
         *  Sort both the arrays in natural order
         *  arrival = 600, ,700, 900
         *  departure = 730, 800, 1000
         * 
         *  600 | A | 1
         *  700 | A | 2  --> Maximum we can meet is 2.
         *  730 | D | 1
         *  800 | D | 0
         *  900 | A | 1
         *  1000| D | 0
         */

         System.out.println("Maximum guest we can meet is : "+findMaximumGuestWeCanMeet(arrival, departure));
    }


    public static int findMaximumGuestWeCanMeet(int arrival[], int departure[]){

        int n = arrival.length;
        //sort the arrays
        Arrays.sort(arrival);
        Arrays.sort(departure);

        int res = 1; // atleast we can meet one guest
        int currRes = 1;
        int i = 1; // maitain the count of arrival
        int j = 0 ; //maintain the count of departure

        while(i < n && j < n){ // O(M+N), here M==N

            // check if we have arrival
            if(arrival[i] <= departure[j]){
                ++currRes;
                ++i;
            }else{
                --currRes;
                ++j;
            }

            res = Math.max(res, currRes);
        }



        return res;

    }
    
}
