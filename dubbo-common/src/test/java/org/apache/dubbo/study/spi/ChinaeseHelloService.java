package org.apache.dubbo.study.spi;

/**
 * @author: jiangxch
 * @date: 2021/5/29 下午6:04
 */
public class ChinaeseHelloService implements HelloService {
    @Override
    public String sayHello() {
        return "你好";
    }
}
