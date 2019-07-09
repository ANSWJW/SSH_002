package _32_服务定位器模式.imp;

import _32_服务定位器模式.api.Service;

public class Service1 implements Service {
    @Override
    public String getName() {
        return "Service1";
    }

    @Override
    public void execute() {
        System.out.println("Executing Service1");
    }
}
