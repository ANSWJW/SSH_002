package 适配器模式.demo01.imp;

import 适配器模式.demo01.api.AdvanceMediaPlayer;

/**
 * Created by WJW on 2019/6/25.
 */
public class VlcPlayer implements AdvanceMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //什么也不做
    }
}
