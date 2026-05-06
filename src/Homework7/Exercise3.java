package Homework7;

import java.util.Stack;

public class Exercise3 {
    public static void main(String[] args) {
        Stack<String> actions = new Stack<>();

        actions.push("Write text");
        actions.push("Delete word");
        actions.push("Insert image");

        String undone = actions.pop();
        System.out.println("Undo: " + undone);

        System.out.println("Remaining: " + actions);
    }
}
