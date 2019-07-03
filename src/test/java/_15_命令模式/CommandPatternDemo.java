package _15_命令模式;

import _15_命令模式.imp.BuyStock;
import _15_命令模式.imp.SellStock;

/**
 * Created by WJW on 2019/7/2.
 */
public class CommandPatternDemo {
    public static void main(String[] args) {

        Stock stock = new Stock();

        BuyStock buyStockOrder = new BuyStock(stock);
        SellStock sellStockOrder = new SellStock(stock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
