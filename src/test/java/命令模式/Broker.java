package 命令模式;

import 命令模式.api.Order;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by WJW on 2019/7/2.
 */
public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
