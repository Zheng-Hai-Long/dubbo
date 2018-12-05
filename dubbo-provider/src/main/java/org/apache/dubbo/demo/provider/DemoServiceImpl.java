package org.apache.dubbo.demo.provider;

import org.apache.dubbo.demo.service.DemoService;

/**
 * Created by ZHL on 2018/12/5.
 */
public class DemoServiceImpl implements DemoService{

    public String sayHello(String name) {
        return "Hello " + name;
    }
}
