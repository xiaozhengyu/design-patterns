package com.xzy.strategy.pattern.cmd.impl;

import com.xzy.strategy.pattern.cmd.Command;
import com.xzy.strategy.pattern.equip.Fan;

/**
 * @author xzy
 * @date 2023/8/6 14:40
 */
public class FanTurnOnCommand implements Command {
    private final Fan fan;

    public FanTurnOnCommand(Fan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        fan.turnOn();
    }
}
