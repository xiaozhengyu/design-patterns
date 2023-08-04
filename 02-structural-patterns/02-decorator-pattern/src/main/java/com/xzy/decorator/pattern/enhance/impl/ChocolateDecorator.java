package com.xzy.decorator.pattern.enhance.impl;

import com.xzy.decorator.pattern.base.Coffee;
import com.xzy.decorator.pattern.enhance.CoffeeDecorator;

/**
 * 具体装饰器类
 *
 * @author xzy.xiao
 * @date 2023/8/3  20:04
 */
public class ChocolateDecorator extends CoffeeDecorator {

    public ChocolateDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String cost() {
        // 添加新的职责
        return super.cost() + "+Chocolate";
    }
}