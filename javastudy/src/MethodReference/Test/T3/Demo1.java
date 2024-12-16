package MethodReference.Test.T3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<T3Student> list = new ArrayList<>();
        Collections.addAll(list,new T3Student("a",1),
                new T3Student("b",12),
                new T3Student("c",11),
                new T3Student("d",14),
                new T3Student("e",11));
        String[] array = list.stream().map(T3Student::toString).toArray(String[]::new);
        System.out.println(Arrays.toString(array));
    }
}
