package dp.hf.observerPattern;

import dp.hf.MyHWInfo;
import dp.hf.observerPattern.observer.impl.CurrentConditionDisplay;
import dp.hf.observerPattern.observer.impl.ForecastDisplay;
import dp.hf.observerPattern.observer.impl.StatisticsDisplay;
import dp.hf.observerPattern.subject.impl.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        MyHWInfo.printInfo();
        WeatherData weatherData = new WeatherData();

        // Observers 에 추가하는 과정
        CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80,65,30.4f);
        System.out.println();
        weatherData.setMeasurements(82, 70, 29.2f);
        System.out.println();
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
