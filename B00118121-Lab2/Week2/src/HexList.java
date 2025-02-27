import java.util.StringTokenizer;

public class HexList extends NumberList {
    private int size; // Size of the hexadecimal list (number of elements).

    // Constructor: takes a string of space-separated hexadecimal numbers and initializes the integer array.
    HexList(String list) {
        StringTokenizer token = new StringTokenizer(list, ", "); // Tokenizes based on commas and spaces.
        size = token.countTokens();
        intList = new int[size]; // Allocates space for integers (hex values will be stored as integers).

        // Parses each token as a hexadecimal and store it as an integer in the array.
        for (int i = 0; i < size; i++) {
            String hexValue = token.nextToken().trim();
            intList[i] = Integer.parseInt(hexValue.replace("0x", ""), 16); // Convert hex to integer.
        }
    }

    // Method to calculate the sum of all hexadecimal values (as integers).
    @Override
    public Number sum() {
        int sum = 0;
        for (int value : intList) {
            sum += value; // Accumulates the sum of integers representing hex values.
        }
        return sum; // Returns the sum as an Integer object.
    }

    // Method to display the list of hexadecimal values in their original format.
    @Override
    public void display() {
        System.out.println("Hexadecimal List:");
        for (int i = 0; i < intList.length; i++) {
            System.out.println("[" + i + "] = 0x" + Integer.toHexString(intList[i]).toUpperCase());
        }
    }
}
