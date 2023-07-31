package com.xzy.abst.factory.patterns.product;

/**
 * 具体产品：小狗
 *
 * @author xzy.xiao
 * @date 2023/7/31  20:00
 */
public class SmallDog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Small Dog: Woof!");
    }
}