package 代理模式.demo01;

import 代理模式.demo01.api.Image;
import 代理模式.demo01.imp.ProxyImage;

/**
 * Created by WJW on 2019/7/1.
 */
public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");
        // 图像将从磁盘加载
        image.display();
        System.out.println("");
        // 图像不需要从磁盘加载
        image.display();


    }
}
