/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Dog extends Animal {

    private String name;
    private int age;
    private String breed;
    private String color;
    private String ownerName;

    public Dog(String name, int age, String breed, String color, String ownerName) {
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
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Dog Owner Name: " + ownerName);
    }

    @Override
    public void makeSound() {
        System.out.println("Dog Woof!");
    }
}
