package com.xzy.simple.factory.patterns.factory;

import com.xzy.simple.factory.patterns.product.ConcreteProductA;
import com.xzy.simple.factory.patterns.product.ConcreteProductB;
import com.xzy.simple.factory.patterns.product.Product;

/**
 * 简单工厂
 *
 * @author xzy
 * @date 2023/7/30 21:12
 */
public class SimpleFactory {

    public static Product createProduct(Type type) {
        switch (type) {
            case PRODUCT_A:
                return new ConcreteProductA();
            case PRODUCT_B:
                return new ConcreteProductB();
            default:
                throw new IllegalArgumentException();
        }
    }

    public enum Type {
        PRODUCT_A,
        PRODUCT_B
    }
}
