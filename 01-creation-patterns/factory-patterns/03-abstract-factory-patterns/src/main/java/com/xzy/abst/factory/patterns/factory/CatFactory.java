package com.xzy.abst.factory.patterns.factory;

import com.xzy.abst.factory.patterns.product.Animal;
import com.xzy.abst.factory.patterns.product.BigCat;
import com.xzy.abst.factory.patterns.product.SmallCat;

/**
 * 具体工厂：猫工厂
 *
 * @author xzy.xiao
 * @date 2023/7/31  20:04
 */
public class CatFactory implements AnimalFactory {
    @Override
    public Animal createSmallAnimal() {
        return new SmallCat();
    }

    @Override
    public Animal createBigAnimal() {
        return new BigCat();
    }
}