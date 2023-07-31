package com.xzy.abst.factory.patterns.factory;

import com.xzy.abst.factory.patterns.product.Animal;
import com.xzy.abst.factory.patterns.product.BigDog;
import com.xzy.abst.factory.patterns.product.SmallDog;

/**
 * 具体工厂：狗工厂
 *
 * @author xzy.xiao
 * @date 2023/7/31  20:04
 */
public class DogFactory implements AnimalFactory {
    @Override
    public Animal createSmallAnimal() {
        return new SmallDog();
    }

    @Override
    public Animal createBigAnimal() {
        return new BigDog();
    }
}