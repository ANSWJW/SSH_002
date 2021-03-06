package _06_适配器模式.demo02.imp;

import _06_适配器模式.demo02.api.Computer;
import _06_适配器模式.demo02.api.SDCard;

/**
 * Created by WJW on 2019/6/25.
 */
public class ThinkpadComputer implements Computer {
    @Override
    public String readSD(SDCard sdCard) {
        if (sdCard == null) throw new NullPointerException();
        return sdCard.readSD();
    }
}
