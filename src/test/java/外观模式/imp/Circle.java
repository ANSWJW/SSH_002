package 外观模式.imp;

import 外观模式.api.Shape;

/**
 * Created by WJW on 2019/6/30.
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}