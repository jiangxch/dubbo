package org.apache.dubbo.study.spi;

import org.apache.dubbo.common.extension.SPI;

/**
 * @author: jiangxch
 * @date: 2021/5/29 下午6:03
 */
@SPI // @SPI 注解标识这个接口是一个可以进行SPI扩展的接口
public interface HelloService {
    String sayHello();
}
