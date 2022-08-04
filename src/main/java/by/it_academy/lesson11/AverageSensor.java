package by.it_academy.lesson11;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {

    private List<Sensor> arraySensor = new ArrayList<>();


    void addSensor(Sensor toAdd) {
        arraySensor.add(toAdd);
    }

    @Override
    public boolean isOn() {
        for (Sensor sensor : arraySensor) {
            if (!sensor.isOn()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void setOn() {
        for (Sensor sensor : arraySensor) {
            sensor.setOn();
        }
    }

    @Override
    public void setOff() {
        for (Sensor sensor : arraySensor) {
            sensor.setOff();
        }
    }

    @Override
    public int read() {
        int sum = 0;
        int count = 0;
        for (Sensor sensor : arraySensor) {
            if (sensor.isOn()) {
                sum += sensor.read();
                count++;
            }
        }
        if (count == 0) {
            throw new IllegalStateException();
        }
        return sum / count;
    }
}