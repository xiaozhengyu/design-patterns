package com.xzy.abst.factory.patterns;

import com.xzy.abst.factory.patterns.factory.ConcreteFactory1;
import com.xzy.abst.factory.patterns.factory.ConcreteFactory2;
import com.xzy.abst.factory.patterns.factory.Factory;
import com.xzy.abst.factory.patterns.product.ProductA;
import com.xzy.abst.factory.patterns.product.ProductB;

/**
 * 客户端
 *
 * @author xzy
 * @date 2023/7/30 21:16
 */
public class Client {
    public static void main(String[] args) {
        Factory factory1 = new ConcreteFactory1();
        ProductA productA1 = factory1.createProductA();
        productA1.doSomething();
        ProductB productB1 = factory1.createProductB();
        productB1.doSomething();

        Factory factory2 = new ConcreteFactory2();
        ProductA productA2 = factory2.createProductA();
        productA2.doSomething();
        ProductB productB2 = factory2.createProductB();
        productB2.doSomething();
    }
}
