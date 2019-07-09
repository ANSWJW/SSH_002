package _32_服务定位器模式.imp;

import _32_服务定位器模式.api.Service;

public class Service2 implements Service{
    @Override
    public void execute(){
        System.out.println("Executing Service2");
    }

    @Override
    public String getName() {
        return "Service2";
    }
}
