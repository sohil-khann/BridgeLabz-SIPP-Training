package JavaConstructor;

public class Person {
    String name;
    int age;

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized Person constructor called.");
    }

    // Copy constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
        System.out.println("Copy Person constructor called.");
    }

    public void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Create a person using the parameterized constructor
        Person person1 = new Person("Alice", 30);
        person1.displayPersonDetails();
        System.out.println("\n");

        // Create a new person using the copy constructor
        Person person2 = new Person(person1);
        person2.displayPersonDetails();

        // Modify person1 to show that person2 is a separate copy
        person1.name = "Alicia";
        System.out.println("\nAfter modifying person1:");
        person1.displayPersonDetails();
        person2.displayPersonDetails();
    }
}