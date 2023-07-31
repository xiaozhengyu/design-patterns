package com.xzy.prototype;

import com.xzy.prototype.patterns.ConcretePrototype;
import com.xzy.prototype.patterns.Prototype;
import org.springframework.util.StopWatch;

/**
 * 客户端
 *
 * @author xzy
 * @date 2023/7/31 22:43
 */
public class Client {
    public static void main(String[] args) throws InterruptedException {
        StopWatch stopWatch = new StopWatch();

        stopWatch.start("Create");
        Prototype p1 = new ConcretePrototype(100);
        stopWatch.stop();

        stopWatch.start("Clone");
        Prototype p2 = p1.clone();
        stopWatch.stop();

        System.out.println(stopWatch.prettyPrint());
    }
}
