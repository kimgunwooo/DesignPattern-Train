package dp.hf.observerPattern.observer.impl;

import dp.hf.observerPattern.observer.DisplayElement;
import dp.hf.observerPattern.observer.Observer;
import dp.hf.observerPattern.subject.Subject;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float avgTemperature;
    private float maxTemperature = Float.MIN_VALUE;
    private float minTemperature = Float.MAX_VALUE;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = "
                + avgTemperature + "/" + maxTemperature + "/" + minTemperature);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        maxTemperature = Math.max(maxTemperature,temperature);
        minTemperature = Math.min(minTemperature,temperature);
        avgTemperature = (maxTemperature + minTemperature)/2;
        display();
    }
}
