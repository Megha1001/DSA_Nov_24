package string;

public class StringEqualityOperation {

    public static void main(String args[]){

        String s1 = "geeks";
        String s2 = "geeks";

        if(s1==s2){
            System.out.println("s1 literal is equal to s2 ");
        }else{
            System.out.println("s1 literal is not equal to s2 ");
        }


        String s3 = new String("geeks");

        if(s1==s3){ // reference comparision
            System.out.println("s1 literal is equal to s3 ");
        }else{
            System.out.println("s1 literal is not equal to s3 ");
        }

        if(s1.equals(s3)){ //content comparision
            System.out.println("s1 literal is equal to s3 using equals method");
        }

    }
    
}
