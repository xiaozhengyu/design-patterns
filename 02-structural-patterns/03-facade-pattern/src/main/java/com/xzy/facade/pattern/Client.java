package com.xzy.facade.pattern;

import com.xzy.facade.pattern.top.ComputerFacade;

/**
 * 客户端
 *
 * @author xzy.xiao
 * @date 2023/8/3  20:55
 */
public class Client {
    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade();
        computer.startComputer();
    }
}
