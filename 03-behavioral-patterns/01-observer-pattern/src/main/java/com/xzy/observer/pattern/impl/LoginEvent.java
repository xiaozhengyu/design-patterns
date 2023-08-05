package com.xzy.observer.pattern.impl;

import com.xzy.observer.pattern.Event;

import java.time.LocalDateTime;

/**
 * 登录事件
 *
 * @author xzy.xiao
 * @date 2023/8/5  18:41
 */
public class LoginEvent implements Event {
    private String account;
    private String ip;
    private LocalDateTime time;

    public LoginEvent() {
    }

    public LoginEvent(String account, String ip, LocalDateTime time) {
        this.account = account;
        this.ip = ip;
        this.time = time;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return String.format("账号：%s\n登录IP：%s\n登录时间：%s\n", account, ip, time);
    }
}
