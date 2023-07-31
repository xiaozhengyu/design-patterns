package com.xzy.singleton.patterns.a;

/**
 * 饿汉式单例模式
 *
 * @author xzy.xiao
 * @date 2023/7/31  20:39
 */
public class EagerSingleton {
    private static final EagerSingleton INSTANCE = new EagerSingleton();

    private EagerSingleton() {
        // 私有构造函数，防止外部实例化
    }

    public static EagerSingleton getInstance() {
        return INSTANCE;
    }
}
