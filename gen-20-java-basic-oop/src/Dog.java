public class Dog extends Animal {
    // Additional attribute for the Dog class
    private String breed;

    // Constructor for the Dog class
    public Dog(String name, int age, String breed) {
        super(name, age); // Call the constructor of the base class
        this.breed = breed;
    }

    // Getter and setter methods for the 'breed' attribute
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    // Override the 'makeSound()' method from the base class
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}