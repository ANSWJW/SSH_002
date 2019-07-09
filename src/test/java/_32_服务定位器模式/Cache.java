package _32_服务定位器模式;

import _32_服务定位器模式.api.Service;

import java.util.ArrayList;
import java.util.List;

public class Cache {
    private List<Service> services;

    public Cache() {
        services = new ArrayList<Service>();
    }

    public void addService(Service newService){
        boolean exists = false;
        for (Service service : services) {
            if (service.getName().equalsIgnoreCase(newService.getName())){
                exists = true;
            }
        }
        if (!exists){
            services.add(newService);
        }
    }

    public Service getService(String serviceName){
        for (Service service : services) {
            if (service.getName().equalsIgnoreCase(serviceName)){
                System.out.println("Returning cached  "+serviceName+" object");
                return service;
            }
        }
        return null;
    }
}
