package org.apache.dubbo.study.spi;

import org.apache.dubbo.common.URL;

/**
 * @author: jiangxch
 * @date: 2021/5/29 下午6:04
 */
public class ChinaeseHelloService implements HelloService {
    @Override
    public String sayHello(URL url) {
        return "你好";
    }
}
