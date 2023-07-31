package com.xzy.factory.method.patterns.factory;

import com.xzy.factory.method.patterns.product.Product;

/**
 * 工厂接口
 *
 * @author xzy
 * @date 2023/7/30 21:26
 */
public interface Factory {
    Product createProduct();
}
