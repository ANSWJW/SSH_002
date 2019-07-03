package _04_建造者模式.imp;

import _04_建造者模式.api.Packing;

/**
 * Created by WJW on 2019/6/23.
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
