//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public static void main(String[] args) {
    String names;

    // If no names are given, default to "World"
    if (args.length == 0) {
        names = "World";
    } else {
        // String.join takes the "glue" first, then the array of names
        // It automatically handles all commas perfectly!
        names = String.join(", ", args);
    }

    System.out.println("Hello, " + names + "!");
}