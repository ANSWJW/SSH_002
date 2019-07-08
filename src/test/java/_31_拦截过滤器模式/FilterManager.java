package _31_拦截过滤器模式;

import _31_拦截过滤器模式.api.Filter;

public class FilterManager {
    FilterChain filterChain;

    public FilterManager(Target target) {
        this.filterChain = new FilterChain();
        filterChain.setTarget(target);
    }
    public void setFilter(Filter filter){
        filterChain.addFilter(filter);
    }
    public void filterRequest(String request){
        filterChain.execute(request);
    }

}
