import java.util.StringTokenizer;

public class IntList extends NumberList {

int size; // Size of the integer array (The number of elements in the list).

	// Constructor: Takes a string of space-separated integers and initializes the integer array.
IntList(String list) {
size = 0;

// Tokenize the input string based on spaces to split individual integers.
StringTokenizer token = new StringTokenizer(list);
size = token.countTokens(); // Counts the number of integers in the list.

// Allocate some space for the array
intList = new int[size];

// Store each list item an the appropriate array
// Parses each token as an integer and store it in the IntList array.
	for(int i=0;i<size;i++) {
	intList[i] = Integer.parseInt(token.nextToken());
	}
}

// Method to calculate the sum of all integers in the list.
public Number sum() {


int n = 0;
for(int i = 0; i < size; i++)
{
n = n + intList[i]; // Accumulates the sum.
}
return new Integer(n); // Returns the sum as an Integer object.

}

// Method to display the list of integers.
public void display() {
	System.out.print("Integer List");

	for(int i = 0; i < size; i++)
	System.out.println("[" + i + "] = " + intList[i]); // Prints each integer with its index.
}

}//end class