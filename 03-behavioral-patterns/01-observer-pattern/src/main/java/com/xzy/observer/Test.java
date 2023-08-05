package com.xzy.observer;

import com.xzy.observer.pattern.impl.LoginLogService;
import com.xzy.observer.pattern.impl.LoginNoticeService;
import com.xzy.observer.pattern.impl.LoginService;

/**
 * @author xzy.xiao
 * @date 2023/8/5  19:01
 */
public class Test {
    public static void main(String[] args) {
        LoginService loginService = new LoginService();
        LoginLogService loginLogService = new LoginLogService();
        LoginNoticeService loginNoticeService = new LoginNoticeService();

        loginService.registerListener(loginLogService);
        loginService.registerListener(loginNoticeService);

        loginService.login("admin", "admin");
        loginService.login("test", "test");
    }
}
