package day1;

import java.util.Iterator;

public class HelloWorld {

    public static void main(String[] args) {

        System.out.println("Hello world");

        Iterator<Integer> t = new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Integer next() {
                return null;
            }
        };
    }

    // this is the first code in java for Batch 23
}
