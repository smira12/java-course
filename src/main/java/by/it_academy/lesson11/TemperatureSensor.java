package by.it_academy.lesson11;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class TemperatureSensor implements Sensor {
    private boolean tempStatus = false;


    @Override
    public boolean isOn() {
        return tempStatus;
    }

    @Override
    public void setOn() {
        tempStatus = true;
    }

    @Override
    public void setOff() {
        tempStatus = false;
    }

    @Override
    public int read() {
        if (tempStatus) {
            Random random = ThreadLocalRandom.current();
            return random.nextInt(61)-30;
        } else {
            throw new IllegalStateException("Sensor is  off , please  on");
        }
    }
}