package by.it_academy.lesson11;

public class StandardSensor implements Sensor {
    private int sensorStatus;

    public StandardSensor(int sensorStatus) {
        this.sensorStatus = sensorStatus;
    }

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void setOn() {
    }

    @Override
    public void setOff() {
    }

    @Override
    public int read() {
        return sensorStatus;
    }
}
