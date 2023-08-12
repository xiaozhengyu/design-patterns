package com.xzy.responsibility.chain.pattern.impl;

import com.xzy.responsibility.chain.pattern.IpResolveHandler;

/**
 * 访问本地数据库进行IP解析
 *
 * @author xzy
 * @date 2023/8/12 22:49
 */
public class LocalIpResolveHandler implements IpResolveHandler {
    @Override
    public IpInfo handle(String ip) {
        // 调用外部接口进行IP解析
        return null;
    }
}
