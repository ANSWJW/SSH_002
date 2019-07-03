package _13_代理模式.demo03_Cglib动态代理;

import _13_代理模式.demo03_Cglib动态代理.imp.Engineer;

/**
 * Created by WJW on 2019/7/1.
 */
public class CglibMainTest {
    public static void main(String[] args) {
        //生成Cglib代理类
        Engineer engineerProxy = (Engineer) CglibProxy.getProxy(new Engineer());
        // 调用相关方法
        engineerProxy.eat();
    }
}
