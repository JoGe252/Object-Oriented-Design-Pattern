// Class representing a Person, using the Builder Pattern
public class Person {
    // Required parameters
    private String firstName;
    private String lastName;

    // Optional parameters
    private String middleName;
    private int age;
    private String fathersName;
    private String mothersName;
    private double height;
    private double weight;

    // Private constructor that takes a Builder object to initialize values
    public Person(Builder builder) {
        this.firstName = builder.firstName;
        this.middleName = builder.middleName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.fathersName = builder.fathersName;
        this.mothersName = builder.mothersName;
        this.height = builder.height;
        this.weight = builder.weight;
    }

    // Method to display person's details
    public void display(){
        System.out.println(firstName + "," + middleName + "," + lastName + "," +
                age + "," + fathersName + "," + mothersName + "," + height + "," + weight);
    }

    // Static inner Builder class to construct Person objects
    public static class Builder {
        // Required parameters
        private String firstName;
        private String lastName;

        // Optional parameters
        private String middleName;
        private int age;
        private String fathersName;
        private String mothersName;
        private double height;
        private double weight;

        // Constructor that takes required parameters
        public Builder(String firstName, String lastName){
            this.firstName = firstName;
            this.lastName = lastName;
        }

        // Setter methods for optional parameters that return the Builder instance
        public Builder setMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }
        public Builder setAge(int age) {
            this.age = age;
            return this;
        }
        public Builder setFathersName(String fathersName) {
            this.fathersName = fathersName;
            return this;
        }
        public Builder setMothersName(String mothersName) {
            this.mothersName = mothersName;
            return this;
        }
        public Builder setHeight(double height) {
            this.height = height;
            return this;
        }
        public Builder setWeight(double weight) {
            this.weight = weight;
            return this;
        }

        // Builds and returns a Person object
        public Person build() {
            return new Person(this);
        }
    }
}
