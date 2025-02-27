//creates the numberlist objects
public class NumberFactory {
	// Factory method to create the appropriate NumberList object based on the input string.
	// Method to determine which type of NumberList to create (IntList or DoubleList)
	public NumberList getNumberList(String list) {
		if (list.contains("0x") || list.contains("0X")) {
			// If the string contains "0x", treat it as a hexadecimal list.
			return new HexList(list);
		} else if (list.contains(".")) {
			// If the string contains a decimal point, treat it as a list of doubles.
			return new DoubleList(list);
		} else {
			// Otherwise, treat it as a list of integers.
			return new IntList(list);
		}
	}
}