package _22_空对象模式.imp;

import _22_空对象模式.api.AbstractCustomer;

public class NullCustomer extends AbstractCustomer {

    @Override
    public boolean isNil() {
        return true;
    }

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }
}
