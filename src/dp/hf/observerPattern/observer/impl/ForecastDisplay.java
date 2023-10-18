package dp.hf.observerPattern.observer.impl;

import dp.hf.observerPattern.observer.DisplayElement;
import dp.hf.observerPattern.observer.Observer;
import dp.hf.observerPattern.subject.Subject;
import dp.hf.observerPattern.subject.impl.WeatherData;

public class ForecastDisplay implements Observer, DisplayElement {
    private float humidity;
    private Subject weatherData;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        if(humidity == 65){
            System.out.println("Forecast: Improving weather on the way!");
        } else if(humidity == 70){
            System.out.println("Forecast: Watch out for cooler, rainy weather");
        } else if(humidity == 90){
            System.out.println("Forecast: More of the same");
        }
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.humidity =humidity;
        display();
    }
}
