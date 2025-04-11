
public class Cat extends Animal {

    private String name;
    private int age;
    private String breed;
    private String color;
    private String ownerName;

    public Cat(String name, int age, String breed, String color, String ownerName) {
        super(name, age, breed, color);
        this.ownerName = ownerName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public void makeSound() {
        System.out.println("Cat Meow!");
    }

}
