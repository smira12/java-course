package by.it_academy.lesson8;

public class Counter {
    int value;

    public Counter(int startValue) {
        this.value = startValue;
    }

    public Counter() {
        this(0);
    }

    public int getValue() {
        return value;
    }

    void increase() {
        value++;
    }

    void decrease() {
        value--;
    }
    void increase(int increaseBy){
        increase();
    }
    void decrease(int decreaseBy){
        decrease();
    }

    public static void main(String[] args) {
        Counter counter = new Counter(20);
        counter.increase(0);
        System.out.println(counter.getValue());
        counter.decrease(0);
        System.out.println(counter.getValue());
    }
}
