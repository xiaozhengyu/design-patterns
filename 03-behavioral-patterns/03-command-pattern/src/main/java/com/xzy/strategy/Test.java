package com.xzy.strategy;

import com.xzy.strategy.pattern.cmd.Command;
import com.xzy.strategy.pattern.cmd.RemoteControl;
import com.xzy.strategy.pattern.cmd.impl.LightTurnOffCommand;
import com.xzy.strategy.pattern.cmd.impl.LightTurnOnCommand;
import com.xzy.strategy.pattern.equip.Light;

/**
 * @author xzy
 * @date 2023/8/6 14:43
 */
public class Test {
    public static void main(String[] args) {
        // 创建灯对象和对应的命令对象
        Light light = new Light();
        Command lightOnCommand = new LightTurnOnCommand(light);
        Command lightOffCommand = new LightTurnOffCommand(light);

        // 创建远程控制器
        RemoteControl remoteControl = new RemoteControl();

        // 测试开关灯命令
        remoteControl.setCommand(lightOnCommand);
        remoteControl.pressButton();

        // 测试关灯命令
        remoteControl.setCommand(lightOffCommand);
        remoteControl.pressButton();
    }
}
