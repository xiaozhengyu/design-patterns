package com.xzy.responsibility.chain.pattern.impl;

import com.xzy.responsibility.chain.pattern.IpResolveHandler;

/**
 * 调用外部接口进行IP解析
 *
 * @author xzy
 * @date 2023/8/12 22:47
 */
public class RemoteIpResolveHandler implements IpResolveHandler {
    @Override
    public IpInfo handle(String ip) {
        // 调用外部接口进行IP解析
        return null;
    }
}
