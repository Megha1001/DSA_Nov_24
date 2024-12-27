package sorting.mergeOverlappingIntervals;


import java.util.Arrays;

/*
 * TIME COMPLEXITY : O(NlogN)
 * AUXILIARY SPACE : O(1)
 */

class Interval implements Comparable<Interval>{

    int s, e;

    Interval(int s, int e){
        this.s = s;
        this.e = e;
    }

    public int compareTo(Interval a){
        return this.s - a.s;
    }

}

public class MergeOverlappingIntervalsEfficientSolution {


    public static void main(String args[]){

        Interval i1[] = {new Interval(5, 10), new Interval(3,15), new Interval(18,30), new Interval(2, 7)};

        int n = i1.length;

        mergeOverlappingIntervalAndPrintThem(i1, n);

    }

    public static void mergeOverlappingIntervalAndPrintThem(Interval i1[], int n){

        Arrays.sort(i1);
        int res = 0; // take the count of NON overlapped intervals

        for(int i=1; i<n; i++){

            //check overlapping
            if(i1[res].e >= i1[i].s){

                i1[res].s = Math.min(i1[res].s, i1[i].s);
                i1[res].e = Math.max(i1[res].e, i1[i].e);

            }else{
                //not overlapping
                ++res;
                i1[res] = i1[i];
            }

        }

        for(int i=0; i<=res; i++){  // Why until res , since res is 0 indexed.
            System.out.println("["+i1[i].s+", "+i1[i].e+"]");
        }



    }

    
}
