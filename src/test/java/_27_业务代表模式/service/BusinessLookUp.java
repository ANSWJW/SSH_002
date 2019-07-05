package _27_业务代表模式.service;

import _27_业务代表模式.api.BusinessService;
import _27_业务代表模式.imp.EJBService;
import _27_业务代表模式.imp.JMSService;

public class BusinessLookUp {
    public BusinessService getBusinessService(String serviceType){
        if (serviceType.equalsIgnoreCase("EJB")){
            return new EJBService();
        }else{
            return new JMSService();
        }
    }
}
