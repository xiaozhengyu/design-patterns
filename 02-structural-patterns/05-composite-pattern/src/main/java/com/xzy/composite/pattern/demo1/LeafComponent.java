package com.xzy.composite.pattern.demo1;

/**
 * 叶节点
 *
 * @author xzy.xiao
 * @date 2023/8/5  16:45
 */
public class LeafComponent implements Component {
    @Override
    public void operation() {
        // 执行叶节点操作
        System.out.println("LeafComponent operation...");
    }
}
