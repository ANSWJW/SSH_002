package 适配器模式.demo02.api;

/**
 * Created by WJW on 2019/6/25.
 */
public interface SDCard {
    //读取SD卡方法
    String readSD();
    //写入SD卡方法
    int writeSD(String msg);
}
