package MethodReference.Test.T2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<T2Student> list = new ArrayList<>();
        Collections.addAll(list,new T2Student("a",1),
                new T2Student("b",12),
                new T2Student("c",11),
                new T2Student("d",14),
                new T2Student("e",11));

        String[] array = list.stream().map(T2Student::getName).toArray(String[]::new);
        System.out.println(Arrays.toString(array));
    }
}
