package Inheritance;

import Inheritance.Animal;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + "Woof woof");
    }
}
