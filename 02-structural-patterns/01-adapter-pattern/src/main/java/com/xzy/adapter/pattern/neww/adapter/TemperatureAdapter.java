package com.xzy.adapter.pattern.neww.adapter;

import com.xzy.adapter.pattern.neww.TemperatureProvider;
import com.xzy.adapter.pattern.old.OldTemperatureSensor;

/**
 * 适配器
 *
 * @author xzy
 * @date 2023/8/2 22:06
 */
public class TemperatureAdapter implements TemperatureProvider {
    private final OldTemperatureSensor oldTemperatureSensor;

    public TemperatureAdapter(OldTemperatureSensor oldTemperatureSensor) {
        this.oldTemperatureSensor = oldTemperatureSensor;
    }

    /**
     * 返回以摄氏度为单位的温度
     *
     * @return -
     */
    @Override
    public double getTemperatureInCelsius() {
        double temperatureInFahrenheit = oldTemperatureSensor.getTemperatureInFahrenheit();
        return (temperatureInFahrenheit - 32.0) * 5.0 / 9.0;
    }
}
