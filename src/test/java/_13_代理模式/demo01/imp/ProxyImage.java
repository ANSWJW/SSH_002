package _13_代理模式.demo01.imp;

import _13_代理模式.demo01.api.Image;

/**
 * Created by WJW on 2019/7/1.
 */
public class ProxyImage implements Image {

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
