package by.it_academy.lesson8;

public class Dog extends Animal implements NoiseCapable {
    public Dog(String name) {
        super(name);
    }

    public Dog() {
        super("Dog");
    }

    static void bark() {
        System.out.println(name() + " barks");
    }

    public static void makeNoise() {
        bark();
    }

    public static void main(String[] args) {
        Dog dog = new Dog("mike");
        System.out.println(Dog.name());
        Dog.eat();
        Dog.sleep();
        Dog.makeNoise();
    }
}
