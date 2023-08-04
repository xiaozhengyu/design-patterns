package com.xzy.prototype.pattern;

/**
 * 具体原型类
 *
 * @author xzy
 * @date 2023/7/31 22:37
 */
public class ConcretePrototype implements Prototype {
    private int property;

    public ConcretePrototype() {
    }

    public ConcretePrototype(int property) throws InterruptedException {
        // 假设对象的创建成本非常高：初始化过程非常复杂，可能涉及数据库访问等资源密集型操作
        Thread.sleep(3000);
        this.property = property;
    }

    public void setProperty(int property) {
        this.property = property;
    }

    @Override
    public Prototype clone() {
        // 通过克隆（复制）现有对象来创建新对象
        // 这种方式有时比使用构造函数来创建对象更加方便和高效，特别是当新对象与现有对象之间差异不大时
        ConcretePrototype concretePrototype = new ConcretePrototype();
        concretePrototype.setProperty(this.property);
        return concretePrototype;
    }
}
