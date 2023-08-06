package com.xzy.strategy.pattern.cmd.impl;

import com.xzy.strategy.pattern.cmd.Command;
import com.xzy.strategy.pattern.equip.Light;

/**
 * @author xzy
 * @date 2023/8/6 14:40
 */
public class LightTurnOffCommand implements Command {
    private final Light light;

    public LightTurnOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
