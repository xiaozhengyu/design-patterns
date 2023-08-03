package com.xzy.decorator.patterns.enhance;

import com.xzy.decorator.patterns.base.Coffee;

/**
 * 装饰器基类
 *
 * @author xzy.xiao
 * @date 2023/8/3  20:02
 */
public abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String cost() {
        return coffee.cost();
    }
}
