package _04_建造者模式.pojo;

import _04_建造者模式.imp.Burger;

/**
 * Created by WJW on 2019/6/23.
 */
public class ChickenBufger extends Burger{
    @Override
    public String name() {
        return "chicken Burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
