package com.xzy.facade.pattern.top;

import com.xzy.facade.pattern.sub.*;

/**
 * 外观类
 *
 * @author xzy.xiao
 * @date 2023/8/3  20:54
 */
public class ComputerFacade {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;
    private OperatingSystem os;
    private Application app;

    public ComputerFacade() {
        cpu = new CPU();
        memory = new Memory();
        hardDrive = new HardDrive();
        os = new OperatingSystem();
        app = new Application();
    }

    public void startComputer() {
        System.out.println("Starting computer...");
        cpu.init();
        memory.init();
        hardDrive.init();
        os.load();
        app.start();
        System.out.println("Computer started successfully");
    }
}
