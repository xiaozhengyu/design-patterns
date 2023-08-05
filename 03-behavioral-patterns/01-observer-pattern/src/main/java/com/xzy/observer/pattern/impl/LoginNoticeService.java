package com.xzy.observer.pattern.impl;

import com.xzy.observer.pattern.EventListener;

/**
 * 推送账号登录通知
 *
 * @author xzy.xiao
 * @date 2023/8/5  18:44
 */
public class LoginNoticeService implements EventListener<LoginEvent> {
    @Override
    public void handle(LoginEvent event) {
        emailNotice(event);
    }

    private void emailNotice(LoginEvent event) {
        // do something...
        System.out.println("邮件通知 =>\n" + event);
    }
}
