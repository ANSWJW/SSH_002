package _31_拦截过滤器模式.imp;

import _31_拦截过滤器模式.api.Filter;

public class AuthenticationFilter implements Filter {
    @Override
    public void execute(String request) {
        System.out.println("Authenticating request: " + request);
    }
}
