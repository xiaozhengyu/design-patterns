package com.xzy.abst.factory.patterns.product;

/**
 * 具体产品：小猫
 *
 * @author xzy.xiao
 * @date 2023/7/31  20:02
 */
public class SmallCat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Small Cat: Meow!");
    }
}
