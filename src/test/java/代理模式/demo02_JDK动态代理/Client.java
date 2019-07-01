package 代理模式.demo02_JDK动态代理;

import 代理模式.demo02_JDK动态代理.api.Subject;
import 代理模式.demo02_JDK动态代理.imp.RealSubject;

import java.lang.reflect.Proxy;

/**
 * Created by WJW on 2019/7/1.
 */
public class Client {
    public static void main(String[] args) {
        //真实对象
        Subject realSubject = new RealSubject();

        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(realSubject);
        //代理对象
        Subject proxyClass = (Subject) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Subject.class}, myInvocationHandler);
        proxyClass.sellBooks();

        proxyClass.speak();
    }
}
