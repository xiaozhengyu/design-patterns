package com.xzy.builder.patterns;

/**
 * 建造者
 *
 * @author xzy
 * @date 2023/8/1 23:06
 */
public class ComputerBuilder {
    private final Computer computer;

    public ComputerBuilder() {
        this.computer = new Computer();
    }

    public ComputerBuilder buildCpu(String cpu) {
        computer.setCpu(cpu);
        return this;
    }

    public ComputerBuilder buildMemory(String memory) {
        computer.setMemory(memory);
        return this;
    }

    public ComputerBuilder buildHardDisk(String disk) {
        computer.setHardDisk(disk);
        return this;
    }

    public ComputerBuilder buildMonitor(String monitor) {
        computer.setMonitor(monitor);
        return this;
    }

    public ComputerBuilder buildGraphicsCard(String graphicsCard) {
        computer.setGraphicsCard(graphicsCard);
        return this;
    }

    public ComputerBuilder buildPowerSupply(String powerSupply) {
        computer.setPowerSupply(powerSupply);
        return this;
    }

    public Computer build() {
        return computer;
    }
}
