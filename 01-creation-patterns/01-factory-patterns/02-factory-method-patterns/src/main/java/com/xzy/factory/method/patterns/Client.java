package com.xzy.factory.method.patterns;

import com.xzy.factory.method.patterns.factory.ConcreteFactoryA;
import com.xzy.factory.method.patterns.factory.Factory;
import com.xzy.factory.method.patterns.product.Product;

/**
 * 客户端
 *
 * @author xzy
 * @date 2023/7/30 21:16
 */
public class Client {
    public static void main(String[] args) {
        Factory factoryA = new ConcreteFactoryA();
        Product productA = factoryA.createProduct();
        productA.doSomething();

        Factory factoryB = new ConcreteFactoryA();
        Product productB = factoryB.createProduct();
        productB.doSomething();
    }
}
