package com.xzy.singleton.patterns.c;

/**
 * 双重检查锁定单例模式
 *
 * @author xzy.xiao
 * @date 2023/7/31  20:42
 */
public class DoubleCheckedSingleton {
    private static volatile DoubleCheckedSingleton instance; // volatile很关键

    private DoubleCheckedSingleton() {
        // 私有构造函数，防止外部实例化
    }

    public static DoubleCheckedSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckedSingleton();
                }
            }
        }
        return instance; // 实例创建完成后不再加锁，优化性能！
    }
}
