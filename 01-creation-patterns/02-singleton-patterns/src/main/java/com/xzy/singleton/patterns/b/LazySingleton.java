package com.xzy.singleton.patterns.b;

/**
 * 懒汉式单例模式
 *
 * @author xzy.xiao
 * @date 2023/7/31  20:41
 */
public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {
        // 私有构造函数，防止外部实例化
    }

    public static synchronized LazySingleton getInstance() { // 每次调用都加锁！
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
