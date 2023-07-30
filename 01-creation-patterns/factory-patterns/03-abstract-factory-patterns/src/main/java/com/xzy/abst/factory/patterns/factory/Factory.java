package com.xzy.abst.factory.patterns.factory;

import com.xzy.abst.factory.patterns.product.ProductA;
import com.xzy.abst.factory.patterns.product.ProductB;

/**
 * 抽象工厂接口
 *
 * @author xzy
 * @date 2023/7/30 21:38
 */
public interface Factory {
    ProductA createProductA();

    ProductB createProductB();
}
