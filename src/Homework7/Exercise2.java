package Homework7;

import java.util.LinkedList;

public class Exercise2 {
    public static void main(String[] args) {
        LinkedList<String> tasks = new LinkedList<>();

        tasks.addFirst("Start task");
        tasks.addLast("Last task");

        tasks.add("Task 1");
        tasks.add("Task 2");
        tasks.add("Task 3");

        tasks.removeFirst();

        tasks.add(1, "Urgent Task");

        tasks.push("Action 1");
        tasks.push("Action 2");
        tasks.push("Action 3");

        tasks.pop();

        System.out.println(tasks);
    }
}
