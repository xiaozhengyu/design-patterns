package com.xzy.abst.factory.patterns.factory;

import com.xzy.abst.factory.patterns.product.ConcreteProductA1;
import com.xzy.abst.factory.patterns.product.ConcreteProductB1;
import com.xzy.abst.factory.patterns.product.ProductA;
import com.xzy.abst.factory.patterns.product.ProductB;

/**
 * 具体工厂类1
 *
 * @author xzy
 * @date 2023/7/30 21:39
 */
public class ConcreteFactory1 implements Factory {
    @Override
    public ProductA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB1();
    }
}
