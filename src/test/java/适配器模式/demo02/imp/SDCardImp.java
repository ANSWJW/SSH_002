package 适配器模式.demo02.imp;

import 适配器模式.demo02.api.SDCard;

/**
 * Created by WJW on 2019/6/25.
 */
public class SDCardImp implements SDCard {
    @Override
    public String readSD() {
        String msg = "sdcard read a msg :hello word SD";
        return msg;
    }
    @Override
    public int writeSD(String msg) {
        System.out.println("sd card write msg : " + msg);
        return 1;
    }
}
