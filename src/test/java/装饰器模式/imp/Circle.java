package 装饰器模式.imp;

import 装饰器模式.api.Shape;

/**
 * Created by WJW on 2019/6/27.
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
