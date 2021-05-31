package org.apache.dubbo.study.spi;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.URLBuilder;
import org.apache.dubbo.common.extension.ExtensionLoader;

import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author: jiangxch
 * @date: 2021/5/29 下午6:07
 */
public class DubboSpiTest {

    @Test
    public void adaptiveTest() {
        HelloService adaptiveExtension = ExtensionLoader.getExtensionLoader(HelloService.class)
                .getAdaptiveExtension();
        URLBuilder urlBuilder = new URLBuilder();
        urlBuilder.addParameter("hello","china");
        URL url = urlBuilder.build();
        System.out.println(adaptiveExtension.sayHello(url));
    }
}
