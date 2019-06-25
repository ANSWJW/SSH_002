package 适配器模式.demo02.api;

/**
 * Created by WJW on 2019/6/25.
 */
public interface TFCard {
    //读取TF卡方法
    String readTF();
    //读取TF卡方法
    int writeTF(String msg);
}
