package com.xzy.composite.pattern.demo1;

import java.util.LinkedList;
import java.util.List;

/**
 * 容器节点
 *
 * @author xzy.xiao
 * @date 2023/8/5  16:46
 */
public class CompositeComponent implements Component {
    private List<Component> children = new LinkedList<>();

    public void add(Component component) {
        children.add(component);
    }

    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public void operation() {
        for (Component component : children) {
            component.operation();
        }
    }
}
