package by.it_academy.lesson8;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void eat() {
        System.out.println(getName() + " eats");
    }

    void sleep() {
        System.out.println(getName() + " sleeps");
    }
}

