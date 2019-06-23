package 建造者模式.imp;

import 建造者模式.api.Packing;

/**
 * Created by WJW on 2019/6/23.
 */
public class Wrapper implements Packing{

    @Override
    public String pack() {
        return "Wrapper";
    }
}
