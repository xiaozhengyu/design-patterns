package com.xzy.composite;

import com.xzy.composite.pattern.demo1.Component;
import com.xzy.composite.pattern.demo1.CompositeComponent;
import com.xzy.composite.pattern.demo1.LeafComponent;

/**
 * @author xzy.xiao
 * @date 2023/8/5  16:49
 */
public class Demo1Test {
    public static void main(String[] args) {
        LeafComponent c1 = new LeafComponent();
        LeafComponent c2 = new LeafComponent();
        LeafComponent c3 = new LeafComponent();
        CompositeComponent c4 = new CompositeComponent();
        c4.add(c1);
        c4.add(c2);
        c4.add(c3);
        CompositeComponent c5 = new CompositeComponent();
        c5.add(c4);


        // 允许客户端以一致的方式处理单个对象和对象组合
        // 单个对象和组合对象之间的区别被模糊化
        useComponent(c1);
        useComponent(c2);
        useComponent(c3);
        useComponent(c4);
        useComponent(c5);
    }

    private static void useComponent(Component component) {
        component.operation();
    }
}
