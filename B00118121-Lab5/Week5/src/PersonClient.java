// Client class to demonstrate the usage of the Person builder
public class PersonClient{
    public static void main(String args[]){

        // Creating a Person object using the Builder pattern
        Person person = new Person.Builder("Paul", "Smyth")
                .setAge(45)
                .setMothersName("Julie")
                .setHeight(6)
                .setWeight(80)
                .build();

        // Displaying the person's details
        person.display();
    }
}