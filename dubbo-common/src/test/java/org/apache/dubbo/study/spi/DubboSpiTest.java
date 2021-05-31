package org.apache.dubbo.study.spi;

import org.apache.dubbo.common.extension.ExtensionLoader;

import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author: jiangxch
 * @date: 2021/5/29 下午6:07
 */
public class DubboSpiTest {
    @Test
    public void spiTest() {
        // 获取china实现

        HelloService chinaHelloService = ExtensionLoader
                // 获取ExtensionLoader
                .getExtensionLoader(HelloService.class)
                // 根据name获取具体实现类
                .getExtension("china");
        System.out.println(chinaHelloService.sayHello());

        // 获取english实现
        HelloService englishHelloService = ExtensionLoader
                .getExtensionLoader(HelloService.class)
                .getExtension("english");
        System.out.println(englishHelloService.sayHello());

        String extensionName = "";// 可以通过rpc传递或者http传递或者注册中心传递
        HelloService service = ExtensionLoader
                .getExtensionLoader(HelloService.class)
                .getExtension("english");
        System.out.println(englishHelloService.sayHello());
    }
}
