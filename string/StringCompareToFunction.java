package string;

public class StringCompareToFunction {

    public static void main(String args[]){
        String s1 = "megha";
        String s2 = "verma1";

        int compare = s1.compareTo(s2);

        System.out.println("compare : "+compare); // -ve value

        String s3 = new String("megha");
        String s4 = new String("verma");

        compare = s3.compareTo(s4);

        System.out.println("compare : "+compare);// -ve value

        compare = s1.compareTo(s3);

        System.out.println("compare : "+compare); // 0 as content is same.
    }
    
}
