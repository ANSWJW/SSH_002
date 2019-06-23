package 建造者模式.imp;

import 建造者模式.api.Item;
import 建造者模式.api.Packing;

/**
 * Created by WJW on 2019/6/23.
 */
public abstract class Burger implements Item{

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price() ;

}
