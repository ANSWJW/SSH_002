package 适配器模式.imp;

import 适配器模式.api.AdvancedMediaPlayer;

public class VlcPlayer implements AdvancedMediaPlayer{

	 @Override
	   public void playVlc(String fileName) {
	      System.out.println("Playing vlc file. Name: "+ fileName);      
	   }
	 
	   @Override
	   public void playMp4(String fileName) {
	      //什么也不做
	   }
}
