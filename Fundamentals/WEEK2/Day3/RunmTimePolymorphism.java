
public class RunmTimePolymorphism {

    public static void main(String[] args) {
        // Create an instance of the subclass
        Animal myDog = new Dog("Buddy", 5, "Labrador", "Black", "John");
        Animal myCat = new Cat("Whiskers", 3, "Siamese", "White", "Jane");

        // Call the makeSound method on both instances
        myDog.makeSound(); // Output: Woof!
        myCat.makeSound(); // Output: Meow!
    }
}
