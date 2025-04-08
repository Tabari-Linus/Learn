
public class Dog extends Animal {

    String breed;

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    public void makeSound() {
        System.out.println("Bark! Bark!");
    }

    public void displayInfo() {
        System.out.println("Animal name is : " + this.name);
        System.out.println("Animal Bred is : " + this.breed);
    }

}
