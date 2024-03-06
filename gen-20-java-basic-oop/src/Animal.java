public class Animal {
    // Protected attributes can be accessed by subclasses
    protected String name;
    protected int age;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter and setter methods for the 'name' attribute
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and setter methods for the 'age' attribute
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Define a method in the base class
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}
