package _06_适配器模式.demo01.api;

/**
 * Created by WJW on 2019/6/25.
 */
public interface AdvanceMediaPlayer {
    public void playVlc(String fileName);
    public void playMp4(String fileName);
}
