package hashing.chaining.collision;

import java.util.ArrayList;
import java.util.LinkedList;


class MyHash{

    int BUCKET;
    ArrayList<LinkedList<Integer>> list;


    MyHash(int b){
        BUCKET = b;
        list = new ArrayList<LinkedList<Integer>>();

        for(int i=0; i<b; i++){
            list.add(new LinkedList<Integer>());
        }
        
    }


    int hashFunction(int key){
        return key%BUCKET;
    }

    void insert(int key){
        int i = hashFunction(key);
        list.get(i).add(key);
    }

    void delete(int key){
        int i = hashFunction(key);
        /*
         * Note : Need to typeCast since in linkedList we have two functions to remove - one for object other for index.
         * If we dont typecast then it will remove using argument as index
         */
        list.get(i).remove((Integer)key);
    }

    boolean search(int key){
        int i = hashFunction(key);
        return list.get(i).contains(key);
    }

}

public class ChainingImplementation {


    
}
