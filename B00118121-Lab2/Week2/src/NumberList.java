// Abstract class serving as the base class for IntList and DoubleList.
// This class defines the protected arrays for storing integers and doubles,
// as well as abstract methods for displaying the list and calculating the sum.

public abstract class NumberList {
	// These are protected arrays to store integers and doubles.
protected int[] intList;
protected double[] doubleList;

// this default constructor initializes the arrays to null.
NumberList() {
	intList = null; doubleList = null;
}

// Getter method for the integer list.
public int[] getIntList() {
	return intList; }

	// Getter method for the double list.
public double[] getDoubleList() {
	return doubleList; }

	//An abstract method for displaying the list (It must be implemented by subclasses).
public void display() {}

	// An abstract method for calculating the sum of the list (It must be implemented by subclasses).
public Number sum() { return null; }

}