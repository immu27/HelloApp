//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public static void main(String[] args) {
    String name = "World";

    if (args.length > 0) {
        StringBuilder nameBuilder = new StringBuilder();

        // Loop through all arguments provided
        for (int i = 0; i < args.length; i++) {
            nameBuilder.append(args[i]);

            // Add a comma and space ONLY if it's not the last name
            if (i < args.length - 1) {
                nameBuilder.append(", ");
            }
        }
        name = nameBuilder.toString();
    }

    System.out.println("Hello, " + name + "!");
}
