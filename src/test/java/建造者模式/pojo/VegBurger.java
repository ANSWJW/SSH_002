package 建造者模式.pojo;

import 建造者模式.imp.Burger;

/**
 * Created by WJW on 2019/6/23.
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
