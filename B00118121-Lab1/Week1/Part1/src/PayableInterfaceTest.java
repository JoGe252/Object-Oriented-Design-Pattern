public class PayableInterfaceTest {
   public static void main(String[] args) {
      // creates four-element Payable arrays
      // Polymorphism here allows different types (Invoice and SalariedEmployee)...
      // to be treated as Payable objects due to the shared Payable interface.
      Payable[] payableObjects = new Payable[] {
         new Invoice("01234", "seat", 2, 375.00),
         new Invoice("56789", "tire", 4, 79.95),
         new SalariedEmployee("John", "Smith", "111-11-1111", 800.00),
         new SalariedEmployee("Lisa", "Barnes", "888-88-8888", 1200.00)
      };

      System.out.println(
         "Invoices and Employees processed polymorphically:"); 

      // 1.generically process each element in array payableObjects
      // 2.Here it processes each element in the payableObjects array polymorphically
      // The actual method calls (toString() and getPaymentAmount()) are resolved at runtime based on the object's type
      for (Payable currentPayable : payableObjects) {
         // output currentPayable and its appropriate payment amount
         // Polymorphic method calls: the appropriate method for each object type is invoked at runtime
         System.out.printf("%n%s %npayment due: $%,.2f%n",
                 // Invokes the toString() specific to the actual object type (Invoice/SalariedEmployee)
            currentPayable.toString(), // could invoke implicitly;
                 // Invokes the getPaymentAmount() specific to the actual object type
            currentPayable.getPaymentAmount()); //Pollymorphically calls getPaymentAmount()
      } 
   } 
} 



