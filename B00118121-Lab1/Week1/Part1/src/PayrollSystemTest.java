public class PayrollSystemTest {
   public static void main(String[] args) {
      // create subclass objects
      // creates objects for different employee types, each subclass of Employee
      // This demonstrates polymorphism because each object (e.g., SalariedEmployee, HourlyEmployee, etc.) ...
      // is being treated as a reference of type Employee (the superclass)
      SalariedEmployee salariedEmployee =                                 
         new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);    
      HourlyEmployee hourlyEmployee =                                     
         new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40);  
      CommissionEmployee commissionEmployee =                             
         new CommissionEmployee(                                          
         "Sue", "Jones", "333-33-3333", 10000, .06);                      
      BasePlusCommissionEmployee basePlusCommissionEmployee =             
         new BasePlusCommissionEmployee(                                  
         "Bob", "Lewis", "444-44-4444", 5000, .04, 300);                  

      System.out.println("Employees processed individually:");

      System.out.printf("%n%s%n%s: $%,.2f%n%n", 
         salariedEmployee, "earned", salariedEmployee.earnings());
      System.out.printf("%s%n%s: $%,.2f%n%n",
         hourlyEmployee, "earned", hourlyEmployee.earnings());
      System.out.printf("%s%n%s: $%,.2f%n%n",
         commissionEmployee, "earned", commissionEmployee.earnings());
      System.out.printf("%s%n%s: $%,.2f%n%n", 
         basePlusCommissionEmployee, 
         "earned", basePlusCommissionEmployee.earnings());

      // creates four-element Employee array
      // This array can hold objects of any class that extends Employee (SalariedEmployee, HourlyEmployee, etc.)...
      // demonstrating polymorphism where a single array stores multiple types of employee objects
      Employee[] employees = new Employee[4]; 

      // initialize array with Employees        
      employees[0] = salariedEmployee;          
      employees[1] = hourlyEmployee;            
      employees[2] = commissionEmployee;        
      employees[3] = basePlusCommissionEmployee;

      System.out.printf("Employees processed polymorphically:%n%n");

      // generically process each element in array employees
      // Polymorphic method call for each employee in the array
      // Even though the reference type is Employee, the correct subclass method is called at runtime
      for (Employee currentEmployee : employees) {
         System.out.println(currentEmployee); // invokes toString

         // determine whether element is a BasePlusCommissionEmployee
         // Checks if the current employee is a BasePlusCommissionEmployee using instanceof
         // This demonstrates dynamic type checking and downcasting to subclass-specific methods
         if (currentEmployee instanceof BasePlusCommissionEmployee) {
            // downcast Employee reference to 
            // BasePlusCommissionEmployee reference
            BasePlusCommissionEmployee employee = 
               (BasePlusCommissionEmployee) currentEmployee; // Downcasting to BasePlusCommissionEmployee

            employee.setBaseSalary(1.10 * employee.getBaseSalary()); // Calling subclass-specific method

            System.out.printf(
               "new base salary with 10%% increase is: $%,.2f%n",
               employee.getBaseSalary());
         }
         // Polymorphic method call: the appropriate earnings() method is called based on the actual object type (Salaried, Hourly, etc.)
         System.out.printf(
            "earned $%,.2f%n%n", currentEmployee.earnings());
      } 

      // get type name of each object in employees array
      for (int j = 0; j < employees.length; j++) {      
         System.out.printf("Employee %d is a %s%n", j,  
            employees[j].getClass().getName());         
      }                                                 
   } 
} 


