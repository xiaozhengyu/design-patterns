package com.xzy.simple.factory.pattern.product;

/**
 * 具体产品类B
 *
 * @author xzy
 * @date 2023/7/30 21:09
 */
public class ConcreteProductB implements Product {
    @Override
    public void doSomething() {
        System.out.println("Product B does something...");
    }
}
