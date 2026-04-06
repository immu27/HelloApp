//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public static void main(String[] args) {
    String finalNames;

    if (args.length == 0) {
        finalNames = "World";
    } else {
        StringBuilder nameBuilder = new StringBuilder();

        // 1. Add EVERY name + a comma and space
        for (String name : args) {
            nameBuilder.append(name).append(", ");
        }

        // 2. Cleanup: If we added names, chop off the last ", "
        if (nameBuilder.length() > 0) {
            // substring(start, end) takes a slice of the text
            // We go from 0 to (Total Length - 2)
            finalNames = nameBuilder.substring(0, nameBuilder.length() - 2);
        } else {
            finalNames = "";
        }
    }

    System.out.println("Hello, " + finalNames + "!");
}