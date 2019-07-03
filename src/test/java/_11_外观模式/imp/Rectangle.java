package _11_外观模式.imp;

import _11_外观模式.api.Shape;

/**
 * Created by WJW on 2019/6/30.
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
