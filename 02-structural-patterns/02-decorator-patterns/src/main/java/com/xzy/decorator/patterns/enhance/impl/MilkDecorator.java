package com.xzy.decorator.patterns.enhance.impl;

import com.xzy.decorator.patterns.base.Coffee;
import com.xzy.decorator.patterns.enhance.CoffeeDecorator;

/**
 * 具体装饰器类
 *
 * @author xzy.xiao
 * @date 2023/8/3  20:04
 */
public class MilkDecorator extends CoffeeDecorator {

    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String cost() {
        // 添加新的职责
        return super.cost() + "+Milk";
    }
}
