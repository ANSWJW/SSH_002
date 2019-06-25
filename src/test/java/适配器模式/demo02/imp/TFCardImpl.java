package 适配器模式.demo02.imp;

import 适配器模式.demo02.api.TFCard;

/**
 * Created by WJW on 2019/6/25.
 */
public class TFCardImpl implements TFCard {
    @Override
    public String readTF() {
        String msg ="tf card reade msg : hello word tf card";
        return msg;
    }
    @Override
    public int writeTF(String msg) {
        System.out.println("tf card write a msg : " + msg);
        return 1;
    }
}
