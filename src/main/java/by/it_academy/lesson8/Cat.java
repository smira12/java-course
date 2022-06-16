package by.it_academy.lesson8;

public class Cat extends Animal implements NoiseCapable {
    public Cat(String name) {
        super(name);
    }

    public Cat() {
        super("Cat");
    }

    static void purr() {
        System.out.println(name() + " purrs");
    }

    public static void makeNoise() {
        purr();
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Tom");
        System.out.println(Cat.name());
        Cat.eat();
        Cat.sleep();
        Cat.makeNoise();
    }
}