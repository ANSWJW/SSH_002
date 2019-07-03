package _15_命令模式.imp;

import _15_命令模式.Stock;
import _15_命令模式.api.Order;

/**
 * Created by WJW on 2019/7/2.
 */
public class SellStock implements Order {

    private Stock abcStock;

    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }
}
