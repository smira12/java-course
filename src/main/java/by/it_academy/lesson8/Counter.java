package by.it_academy.lesson8;

public class Counter {
    int value;

    public Counter(int startValue) {
        this.value = startValue;
    }

    public Counter() {
        this(0);
    }

    int getValue() {
        return value;
    }

    void increase() {
        value++;
    }

    void decrease() {
        value--;
    }

    void increase(int increaseBy) {
        value += increaseBy;
    }

    void decrease(int decreaseBy) {
        value -= decreaseBy;
    }

    public static void main(String[] args) {
        Counter counter = new Counter();
        counter.increase();
        System.out.println(counter.getValue());
        counter.decrease();
        System.out.println(counter.getValue());
        counter.increase(18);
        System.out.println(counter.getValue());
        counter.decrease(7);
        System.out.println(counter.getValue());
    }
}
