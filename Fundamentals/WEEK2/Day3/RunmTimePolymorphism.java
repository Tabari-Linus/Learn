
public class RunmTimePolymorphism {

    public static void main(String[] args) {

        Animal buddyDog = new Dog("Buddy", 5, "Labrador", "Black", "John");
        Animal whisherCat = new Cat("Whiskers", 3, "Siamese", "White", "Jane");

        buddyDog.displayInfo();
        whisherCat.displayInfo();
        buddyDog.makeSound();
        whisherCat.makeSound();
    }
}
