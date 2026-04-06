//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public static void main(String[] args) {
    String finalNames;

    // Check if any arguments were passed
    if (args.length == 0) {
        finalNames = "World";
    } else {
        StringBuilder nameBuilder = new StringBuilder();
        boolean first = true;

        // The "Enhanced For Loop" - it reads "for each String 'name' in 'args'"
        for (String name : args) {
            // Only add a comma if this is NOT the very first name we process
            if (!first) {
                nameBuilder.append(", ");
            }
            nameBuilder.append(name);

            // After the first name is added, set this to false so
            // the NEXT names get a comma
            first = false;
        }
        finalNames = nameBuilder.toString();
    }

    System.out.println("Hello, " + finalNames + "!");
}