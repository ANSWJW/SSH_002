package 命令模式.imp;

import 命令模式.Stock;
import 命令模式.api.Order;

/**
 * Created by WJW on 2019/7/2.
 */
public class BuyStock implements Order {

    private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}
