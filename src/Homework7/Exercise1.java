package Homework7;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Exercise1 {
    public static void main(String[] args) {
        List<Integer> grades = new ArrayList<>();

        grades.add(2);
        grades.add(3);
        grades.add(7);
        grades.add(7);
        grades.add(1);

        System.out.println("Third grade: " + grades.get(2));

        grades.set(1, 100);

        System.out.println("Contains grade 10? " + grades.contains(10));

        System.out.println(grades);

        grades.remove(Integer.valueOf(7));
        grades.remove(Integer.valueOf(7));

        System.out.println("Final grades: " + grades);
    }
}