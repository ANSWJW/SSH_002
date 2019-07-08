package _31_拦截过滤器模式;

import _31_拦截过滤器模式.imp.AuthenticationFilter;
import _31_拦截过滤器模式.imp.DebugFilter;

public class InterctingFilterDemo {
    public static void main(String[] args) {
        FilterManager filterManager = new FilterManager(new Target());
        filterManager.setFilter(new AuthenticationFilter());
        filterManager.setFilter(new DebugFilter());

        Client client = new Client();
        client.setFilterManager(filterManager);
        client.sendRequest("Home");
    }
}
