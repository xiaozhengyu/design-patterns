package com.xzy.abst.factory.patterns.factory;

import com.xzy.abst.factory.patterns.product.Animal;

/**
 * 抽象工厂：动物工厂
 *
 * @author xzy.xiao
 * @date 2023/7/31  20:03
 */
public interface AnimalFactory {
    Animal createSmallAnimal();

    Animal createBigAnimal();
}
