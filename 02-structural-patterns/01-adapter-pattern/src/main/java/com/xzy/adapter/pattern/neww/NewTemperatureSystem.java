package com.xzy.adapter.pattern.neww;

/**
 * 使用新接口的系统
 *
 * @author xzy
 * @date 2023/8/2 22:09
 */
public class NewTemperatureSystem {
    private final TemperatureProvider temperatureProvider;

    public NewTemperatureSystem(TemperatureProvider temperatureProvider) {
        this.temperatureProvider = temperatureProvider;
    }

    public void displayTemperature() {
        double temperatureInCelsius = temperatureProvider.getTemperatureInCelsius();
        System.out.println("Temperature in Celsius: " + temperatureInCelsius);
    }
}
