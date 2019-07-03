package _06_适配器模式.demo01.imp;

import _06_适配器模式.demo01.api.AdvanceMediaPlayer;

/**
 * Created by WJW on 2019/6/25.
 */
public class Mp4Player implements AdvanceMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        //什么也不做
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
