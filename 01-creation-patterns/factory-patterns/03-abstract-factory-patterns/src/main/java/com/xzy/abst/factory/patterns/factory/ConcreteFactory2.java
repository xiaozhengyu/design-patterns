package com.xzy.abst.factory.patterns.factory;

import com.xzy.abst.factory.patterns.product.ConcreteProductA2;
import com.xzy.abst.factory.patterns.product.ConcreteProductB2;
import com.xzy.abst.factory.patterns.product.ProductA;
import com.xzy.abst.factory.patterns.product.ProductB;

/**
 * 具体工厂类2
 *
 * @author xzy
 * @date 2023/7/30 21:39
 */
public class ConcreteFactory2 implements Factory {
    @Override
    public ProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB2();
    }
}
