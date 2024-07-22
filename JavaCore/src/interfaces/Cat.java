package interfaces;

public class Cat implements Animal{
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }

    @Override
    public void makeSound() {
        System.out.println("Meow meow");
    }
}
