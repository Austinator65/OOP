package Inheritance;

// Subclass (Derived class)
class Dog extends Animal {
    public Dog(String name) {
        super(name); // Call the constructor of the superclass
    }

    // Overriding the makeSound method
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }

}