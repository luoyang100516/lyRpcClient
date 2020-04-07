package com.ly.test;

import com.ly.proxy.RpcProxyClient;
import service.IHelloService;

public class HelloTest {
    public static void main(String[] args) {
        RpcProxyClient rpcProxyClient = new RpcProxyClient();
//        rpcProxyClient.clientProxy(IHelloService.class)
        IHelloService helloService=rpcProxyClient.
                clientProxy(IHelloService.class,"localhost",8080);

        System.out.println(helloService.sayHello("ly"));
    }
}
