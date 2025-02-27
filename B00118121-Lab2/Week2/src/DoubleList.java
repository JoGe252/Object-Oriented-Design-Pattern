import java.util.StringTokenizer;

public class DoubleList extends NumberList {

int size; // Size of the double array (The number of elements in the list).

	// Constructor: Takes a string of space-separated decimal numbers and initializes the double array.
DoubleList(String list) { size = 0;

	// Tokenizes the input string based on spaces to split individual decimal numbers.
StringTokenizer token = new StringTokenizer(list);
size = token.countTokens();

// Allocate some space for the array
doubleList = new double[size];

// Store each list item an the appropriate array
// Parses each token as a double and store it in the doubleList array.
for(int i = 0; i < size; i++) {
	doubleList[i] = Double.parseDouble(token.nextToken());
}
}

// Method to calculate the sum of all doubles in the list.
public Number sum() {

double n = 0;
for(int i = 0; i < size; i++) {
	n = n + doubleList[i]; // Accumulates the sum.
}
return new Double(n); // Returns the sum as a Double object.
}

// Method to display the list of doubles.
public void display() {
System.out.print("Double List"); for(int i = 0; i < size; i++)
System.out.println("[" + i + "] = " + doubleList[i]); // Prints each double with its index.
}
}