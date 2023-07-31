package com.xzy.abst.factory.patterns.product;

/**
 * 具体产品：大狗
 *
 * @author xzy.xiao
 * @date 2023/7/31  20:01
 */
public class BigDog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Big Dog: Woof Woof!");
    }
}