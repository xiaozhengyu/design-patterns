package com.xzy.abst.factory.patterns.product;

/**
 * 具体产品：大猫
 *
 * @author xzy.xiao
 * @date 2023/7/31  20:02
 */
public class BigCat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Big Cat: Roar!");
    }
}
