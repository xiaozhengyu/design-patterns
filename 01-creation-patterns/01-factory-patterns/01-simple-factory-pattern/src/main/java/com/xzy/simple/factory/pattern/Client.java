package com.xzy.simple.factory.pattern;

import com.xzy.simple.factory.pattern.factory.SimpleFactory;
import com.xzy.simple.factory.pattern.product.Product;

/**
 * 客户端
 *
 * @author xzy
 * @date 2023/7/30 21:16
 */
public class Client {
    public static void main(String[] args) {
        Product productA = SimpleFactory.createProduct(SimpleFactory.Type.PRODUCT_A);
        productA.doSomething();

        Product productB = SimpleFactory.createProduct(SimpleFactory.Type.PRODUCT_B);
        productB.doSomething();
    }
}
