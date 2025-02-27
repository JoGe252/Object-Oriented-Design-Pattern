public class PolymorphismTest {
   public static void main(String[] args) {
      // assign superclass reference to superclass variable
      // This demonstrates polymorphism because CommissionEmployee is the superclass,
      // but the reference points to an object of the subclass BasePlusCommissionEmployee.
      CommissionEmployee commissionEmployee = new CommissionEmployee(
         "Sue", "Jones", "222-22-2222", 10000, .06);                 

      // assign subclass reference to subclass variable
      // Here the basePlusCommissionEmployee is an instance of the subclass BasePlusCommissionEmployee
      BasePlusCommissionEmployee basePlusCommissionEmployee =
         new BasePlusCommissionEmployee(                     
         "Bob", "Lewis", "333-33-3333", 5000, .04, 300);// Subclass reference

      // invoke toString on superclass object using superclass variable
      // Invoking toString() on superclass reference (commissionEmployee)
      // Even though commissionEmployee is a superclass reference, calling toString() invokes the method defined in CommissionEmployee
      System.out.printf("%s %s:%n%n%s%n%n", 
         "Call CommissionEmployee's toString with superclass reference ",
         "to superclass object", commissionEmployee.toString());

      // invoke toString on subclass object using subclass variable
      // Invoking toString() on subclass reference (basePlusCommissionEmployee)
      // This calls the toString() method from the BasePlusCommissionEmployee subclass, which includes more specific details.
      System.out.printf("%s %s:%n%n%s%n%n", 
         "Call BasePlusCommissionEmployee's toString with subclass",
         "reference to subclass object", 
         basePlusCommissionEmployee.toString());

      // invoke toString on subclass object using superclass variable
      // Invoking toString() on subclass object using superclass reference (commissionEmployee2)
      // Here the commissionEmployee2 is a superclass reference, but it refers to a subclass object (BasePlusCommissionEmployee)
      // The correct toString() method is called at runtime, demonstrating polymorphism in action.
      CommissionEmployee commissionEmployee2 =  // Assigning subclass object to superclass reference
         basePlusCommissionEmployee;          
      System.out.printf("%s %s:%n%n%s%n", 
         "Call BasePlusCommissionEmployee's toString with superclass",
         "reference to subclass object", commissionEmployee2.toString());
   } 
} 



