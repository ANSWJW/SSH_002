package _22_空对象模式;

import _22_空对象模式.api.AbstractCustomer;
import _22_空对象模式.imp.NullCustomer;
import _22_空对象模式.imp.RealCustomer;

public class CustomerFactory {
    public static final String[] names = {"Rob", "Joe", "Julie"};

    public static AbstractCustomer getCustomer(String name){
        for(int i = 0 ;i<names.length;i++){
            if (names[i].equalsIgnoreCase(name)){
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
