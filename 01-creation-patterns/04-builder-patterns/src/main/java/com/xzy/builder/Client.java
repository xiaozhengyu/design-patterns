package com.xzy.builder;

import com.xzy.builder.patterns.Computer;
import com.xzy.builder.patterns.ComputerBuilder;

/**
 * 客户端
 * <p>
 * 其实这个{@code Computer}这个类完全不算复杂，真正的复杂类可以看{@link org.springframework.beans.factory.config.BeanDefinition}，
 * 与之搭配的Builder是{@link org.springframework.beans.factory.support.BeanDefinitionBuilder}
 *
 * @author xzy
 * @date 2023/8/1 23:17
 */
public class Client {
    public static void main(String[] args) {
        ComputerBuilder computerBuilder = new ComputerBuilder();

        Computer computer = computerBuilder
                .buildCpu("Intel Core i7")
                .buildMemory("16GB DDR4")
                .buildHardDisk("1TB SSD")
//                .buildMonitor("27-inch 4K IPS Monitor")
//                .buildGraphicsCard("NVIDIA GeForce RTX 3080")
//                .buildPowerSupply("750W Gold Certified")
                .build();

        System.out.println(computer);
    }
}
