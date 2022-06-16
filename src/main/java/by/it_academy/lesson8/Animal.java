package by.it_academy.lesson8;

public abstract class Animal {
    private static String name;

    public Animal(String name) {
        this.name = name;
    }

    public static String name() {
        return name;
    }

    static void eat() {
        System.out.println(name + " eats");
    }

    static void sleep() {
        System.out.println(name + " sleeps");
    }
}

