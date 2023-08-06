package com.xzy.strategy.pattern.cmd.impl;

import com.xzy.strategy.pattern.cmd.Command;
import com.xzy.strategy.pattern.equip.Fan;

/**
 * @author xzy
 * @date 2023/8/6 14:40
 */
public class FanTurnOffCommand implements Command {
    private final Fan fan;

    public FanTurnOffCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.turnOff();
    }
}
