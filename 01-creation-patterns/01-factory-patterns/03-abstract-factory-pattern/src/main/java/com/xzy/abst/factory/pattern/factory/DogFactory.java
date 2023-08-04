package com.xzy.abst.factory.pattern.factory;

import com.xzy.abst.factory.pattern.product.Animal;
import com.xzy.abst.factory.pattern.product.BigDog;
import com.xzy.abst.factory.pattern.product.SmallDog;

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