package _04_建造者模式.pojo;

import _04_建造者模式.imp.ColdDrink;

/**
 * Created by WJW on 2019/6/23.
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
