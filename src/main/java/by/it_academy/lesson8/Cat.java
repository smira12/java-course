package by.it_academy.lesson8;

public class Cat extends Animal implements NoiseCapable {
    public Cat(String name) {
        super(name);
    }

    public Cat() {
        super("Cat");
    }

    void purr() {
        System.out.println(getName() + " purrs");
    }

    public void makeNoise() {
        purr();
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Tom");
        System.out.println(cat.getName());
        cat.eat();
        cat.sleep();
        cat.makeNoise();
    }
}