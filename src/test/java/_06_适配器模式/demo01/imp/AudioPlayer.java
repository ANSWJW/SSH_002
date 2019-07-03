package _06_适配器模式.demo01.imp;

import _06_适配器模式.demo01.api.MediaPlayer;

/**
 * Created by WJW on 2019/6/25.
 */
public class AudioPlayer implements MediaPlayer {

    MediaPlayer mediaPlayer;

    @Override
    public void play(String audioType, String fileName) {
        //播放MP3音乐文件的内置支持
        if (audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file. Name: "+ fileName);
        }else if (audioType.equalsIgnoreCase("vlc") ||
                audioType.equalsIgnoreCase("mp4")){
            //mediaAdapter提供了播放其他文件格式的支持
            mediaPlayer = new MediaAdapter(audioType);
            mediaPlayer.play(audioType,fileName);
        }else{
            System.out.println("Invalid media. "+ audioType + " format not supported");
        }
    }
}
