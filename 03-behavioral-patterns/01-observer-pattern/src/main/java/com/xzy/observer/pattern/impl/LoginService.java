package com.xzy.observer.pattern.impl;

import com.xzy.observer.pattern.EventListener;
import com.xzy.observer.pattern.EventPublisher;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

/**
 * @author xzy.xiao
 * @date 2023/8/5  18:52
 */
public class LoginService implements EventPublisher<LoginEvent> {

    private final List<EventListener<LoginEvent>> eventListenerList = new LinkedList<>();

    public void login(String account, String pwd) {
        // 登录逻辑...
        String ip = "xxx.xxx.xxx.xxx";
        LocalDateTime time = LocalDateTime.now();

        // 事件通知
        publishEvent(new LoginEvent(account, ip, time));
    }

    @Override
    public void registerListener(EventListener<LoginEvent> eventListener) {
        eventListenerList.add(eventListener);
    }

    @Override
    public void publishEvent(LoginEvent event) {
        eventListenerList.forEach(l -> l.handle(event));
    }
}
