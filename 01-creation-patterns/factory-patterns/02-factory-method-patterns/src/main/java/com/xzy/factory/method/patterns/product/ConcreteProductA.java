package com.xzy.factory.method.patterns.product;

/**
 * 具体产品类A
 *
 * @author xzy
 * @date 2023/7/30 21:09
 */
public class ConcreteProductA implements Product {
    @Override
    public void doSomething() {
        System.out.println("Product A does something...");
    }
}
