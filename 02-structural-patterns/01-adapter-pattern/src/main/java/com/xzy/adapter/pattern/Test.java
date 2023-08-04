package com.xzy.adapter.pattern;

import com.xzy.adapter.pattern.neww.adapter.TemperatureAdapter;
import com.xzy.adapter.pattern.neww.NewTemperatureSystem;
import com.xzy.adapter.pattern.old.OldTemperatureSensor;

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
