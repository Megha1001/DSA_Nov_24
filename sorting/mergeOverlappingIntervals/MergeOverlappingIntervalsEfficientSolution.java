package sorting.mergeOverlappingIntervals;


import java.util.Arrays;

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

    }

    
}
