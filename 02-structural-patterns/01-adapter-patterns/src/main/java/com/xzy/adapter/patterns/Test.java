package com.xzy.adapter.patterns;

import com.xzy.adapter.patterns.neww.adapter.TemperatureAdapter;
import com.xzy.adapter.patterns.neww.NewTemperatureSystem;
import com.xzy.adapter.patterns.old.OldTemperatureSensor;

/**
 * @author xzy
 * @date 2023/8/2 22:08
 */
public class Test {
    public static void main(String[] args) {
        NewTemperatureSystem newTemperatureSystem = new NewTemperatureSystem(new TemperatureAdapter(new OldTemperatureSensor()));
        newTemperatureSystem.displayTemperature();
    }
}
