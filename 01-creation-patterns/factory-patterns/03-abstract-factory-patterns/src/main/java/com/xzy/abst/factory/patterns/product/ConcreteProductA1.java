package com.xzy.abst.factory.patterns.product;

/**
 * 具体产品类A1
 *
 * @author xzy
 * @date 2023/7/30 21:09
 */
public class ConcreteProductA1 implements ProductA {
    @Override
    public void doSomething() {
        System.out.println("Product A1 does something...");
    }
}
