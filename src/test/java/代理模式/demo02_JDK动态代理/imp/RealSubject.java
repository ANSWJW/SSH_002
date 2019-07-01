package 代理模式.demo02_JDK动态代理.imp;

import 代理模式.demo02_JDK动态代理.api.Subject;

/**
 * Created by WJW on 2019/7/1.
 */
public class RealSubject implements Subject {
    @Override
    public int sellBooks() {
        System.out.println("卖书");
        return 1 ;
    }

    @Override
    public String speak() {
        System.out.println("说话");
        return "张三";
    }
}
