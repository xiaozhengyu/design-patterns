package com.xzy.observer.pattern;

/**
 * @author xzy.xiao
 * @date 2023/8/5  18:30
 */
public interface EventListener<T extends Event> {
    void handle(T event);
}