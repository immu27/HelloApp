package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // UC3: Use ternary operator to set name to args[0] OR "World"
        String name = (args.length > 0) ? args[0] : "World";

        // Display the greeting
        System.out.println("Hello, " + name + "!");
    }
}
