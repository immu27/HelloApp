package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        if (args.length > 0) {
            // This line runs if you put "Immanuel" in the box
            System.out.println("Hello, " + args[0] + "!");
        } else {
            // This line runs if the box is empty
            System.out.println("Hello, World!");
        }
    }
}
