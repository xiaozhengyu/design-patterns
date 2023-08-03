package com.xzy.decorator.patterns;

import com.xzy.decorator.patterns.base.Coffee;
import com.xzy.decorator.patterns.base.impl.SimpleCoffee;
import com.xzy.decorator.patterns.enhance.impl.ChocolateDecorator;
import com.xzy.decorator.patterns.enhance.impl.MilkDecorator;
import com.xzy.decorator.patterns.enhance.impl.SugarDecorator;

/**
 * 装饰器模式可以在不修改原接口的前提下动态的增强原接口的功能
 *
 * @author xzy.xiao
 * @date 2023/8/3  20:11
 */
public class Test {
    public static void main(String[] args) {
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println(simpleCoffee.cost());

        Coffee chocolateCoffee = new ChocolateDecorator(new SimpleCoffee());
        System.out.println(chocolateCoffee.cost());

        Coffee milkChocolateCoffee = new MilkDecorator(new ChocolateDecorator(new SimpleCoffee()));
        System.out.println(milkChocolateCoffee.cost());

        Coffee sugarMilkChocolateCoffee = new SugarDecorator(new MilkDecorator(new ChocolateDecorator(new SimpleCoffee())));
        System.out.println(sugarMilkChocolateCoffee.cost());

        SugarDecorator sugarCoffee = new SugarDecorator(new SimpleCoffee());
        System.out.println(sugarCoffee.cost());

        // 装饰器可以互相叠加，形成包装链...
    }
}
