package by.it_academy.lesson11;

public class Main {
    public static void main(String[] args) {
        AverageSensor sensor = new AverageSensor();
        sensor.addSensor(new StandardSensor(5));
        sensor.addSensor(new TemperatureSensor());
        sensor.addSensor(new TemperatureSensor());

        System.out.println("sensor.read() = " + sensor.read());
        sensor.setOn();
        System.out.println("sensor.read() = " + sensor.read());
    }
}
