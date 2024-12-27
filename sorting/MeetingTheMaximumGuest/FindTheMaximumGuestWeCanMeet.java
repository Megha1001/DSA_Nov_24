package sorting.MeetingTheMaximumGuest;

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
    }
    
}
