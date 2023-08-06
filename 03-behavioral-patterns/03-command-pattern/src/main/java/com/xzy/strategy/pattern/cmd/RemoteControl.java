package com.xzy.strategy.pattern.cmd;

/**
 * @author xzy
 * @date 2023/8/6 17:04
 */
public class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}
