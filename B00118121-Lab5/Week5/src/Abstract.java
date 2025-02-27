// Abstract Class
abstract class Animal {
    abstract void makeSound(); // No implementation
}

// Concrete Class
class Dog extends Animal {
    void makeSound() {
        System.out.println("Bark!");
    }
}
