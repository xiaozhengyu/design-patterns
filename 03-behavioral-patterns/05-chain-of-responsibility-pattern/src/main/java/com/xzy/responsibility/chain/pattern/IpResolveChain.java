package com.xzy.responsibility.chain.pattern;

import java.util.LinkedList;
import java.util.List;

/**
 * @author xzy
 * @date 2023/8/12 22:51
 */
public class IpResolveChain {

    private final List<IpResolveHandler> ipResolveHandlers = new LinkedList<>();

    public void register(IpResolveHandler ipResolveHandler) {
        ipResolveHandlers.add(ipResolveHandler);
    }

    public IpResolveHandler.IpInfo resolveIp(String ip) {
        for (IpResolveHandler ipResolveHandler : ipResolveHandlers) {
            IpResolveHandler.IpInfo result = ipResolveHandler.handle(ip);
            if (result != null) {
                return result;
            }
        }

        return null;
    }
}
