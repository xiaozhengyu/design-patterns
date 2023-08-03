package com.xzy.decorator.patterns.base.impl;

import com.xzy.decorator.patterns.base.Coffee;

/**
 * 基础实现类
 *
 * @author xzy.xiao
 * @date 2023/8/3  20:00
 */
public class SimpleCoffee implements Coffee {
    @Override
    public String cost() {
        return "Coffee";
    }
}
