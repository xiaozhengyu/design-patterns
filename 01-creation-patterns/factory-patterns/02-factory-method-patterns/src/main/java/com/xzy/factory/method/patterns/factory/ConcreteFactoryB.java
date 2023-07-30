package com.xzy.factory.method.patterns.factory;

import com.xzy.factory.method.patterns.product.ConcreteProductB;
import com.xzy.factory.method.patterns.product.Product;

/**
 * 具体工厂类
 *
 * @author xzy
 * @date 2023/7/30 21:27
 */
public class ConcreteFactoryB implements Factory {
    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }
}
