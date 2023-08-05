package com.xzy.observer.pattern.impl;

import com.xzy.observer.pattern.EventListener;

/**
 * 记录账号登录日志
 *
 * @author xzy.xiao
 * @date 2023/8/5  18:43
 */
public class LoginLogService implements EventListener<LoginEvent> {
    @Override
    public void handle(LoginEvent event) {
        saveLog(event);
    }

    private void saveLog(LoginEvent event) {
        // do something...
        System.out.println("记录日志 =>\n" + event);
    }
}
