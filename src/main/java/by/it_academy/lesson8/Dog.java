package by.it_academy.lesson8;

public class Dog extends Animal implements NoiseCapable {
    public Dog(String name) {
        super(name);
    }

    public Dog() {
        super("Dog");
    }

    void bark() {
        System.out.println(getName() + " barks");
    }

    public void makeNoise() {
        bark();
    }

    public static void main(String[] args) {
        Dog dog = new Dog("mike");
        System.out.println(dog.getName());
        dog.eat();
        dog.sleep();
        dog.makeNoise();
    }
}
