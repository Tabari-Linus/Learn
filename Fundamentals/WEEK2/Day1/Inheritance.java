
// class Animal {
//     String name;
//     Animal(String name) {
//         this.name = name;
//         System.out.println("Animal Created");
//     }
//     public void makeSound() {
//         System.out.println("Some generic animal sound");
//     }
// }
// class Dog extends Animal {
//     String breed;
//     public Dog(String name, String breed) {
//         super(name);
//         this.breed = breed;
//     }
//     public void makeSound() {
//         System.out.println("Bark! Bark!");
//     }
//     public void displayInfo() {
//         System.out.println("Animal name is : " + this.name);
//         System.out.println("Animal Bred is : " + this.breed);
//     }
// }
public class Inheritance {

    public static void main(String[] args) {

        Dog Jack = new Dog("Jack", "Bulldog");
        Jack.makeSound();
    }
}
