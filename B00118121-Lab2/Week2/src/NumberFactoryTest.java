public class NumberFactoryTest{

	public static void main (String [] args){

		// Creates two string representations of numbers.
		// list1 contains integers, while list2 contains floating-point numbers (decimals).
		String list1 = new String("1 2 3 4 5 6 7 8 9 10"); // Integer List
		String list2 = new String("1.1 2.2 3.3 4.4 5.5 6.6 7.7 8.8 9.9 10.1"); //Double List
		String list3 = new String("0xFF 0xAF45 0x1A 0xC0 0xBEEF");

		// Creates an instance of NumberFactory to generate NumberList objects.
		NumberFactory nfactory = new NumberFactory();

		//getNumberList is method of the numberfactory class and checks for decimal
		// Calls getNumberList with list1 (integer list).
		// This will create an IntList object and call its display method.
		nfactory.getNumberList(list1).display();//getNumberList creates and displays an IntList object
		                                        // Outputs will display the integers in the list.

		System.out.println("");

		// Calls getNumberList with list2 (double list) and store the returned object in numberlist2.
		// Since list2 contains decimals, a DoubleList object will be created.
		NumberList numberlist2 = nfactory.getNumberList(list2);//getNumberList creates and displays a DoubleList object
		//using our reference variable numberlist2 above allows us to store the reference returned by getNumberList (a list of doubles)

		// Displays the list of doubles using the display method from DoubleList.
	    numberlist2.display();//we use our reference to call our display method

		System.out.println("");

		// Calculates and displays the sum of the elements in list2.
		System.out.println("Sum of list 2:" + numberlist2.sum());

		// Handle hexadecimal list
		NumberList numberList3 = nfactory.getNumberList(list3);
		numberList3.display();
		System.out.println("Sum of list 3: " + numberList3.sum());

	}
}
