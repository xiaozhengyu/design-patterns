package com.xzy.abst.factory.patterns.product;

/**
 * 具体产品类B1
 *
 * @author xzy
 * @date 2023/7/30 21:09
 */
public class ConcreteProductB1 implements ProductB {
    @Override
    public void doSomething() {
        System.out.println("Product B1 does something...");
    }
}
