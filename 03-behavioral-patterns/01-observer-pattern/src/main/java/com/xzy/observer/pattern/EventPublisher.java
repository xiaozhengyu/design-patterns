package com.xzy.observer.pattern;

/**
 * @author xzy.xiao
 * @date 2023/8/5  18:30
 */
public interface EventPublisher<T extends Event> {

    void registerListener(EventListener<T> eventListener);

    void publishEvent(T event);
}
