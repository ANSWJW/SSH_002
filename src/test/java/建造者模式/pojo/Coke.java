package 建造者模式.pojo;

import 建造者模式.imp.ColdDrink;

/**
 * Created by WJW on 2019/6/23.
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
