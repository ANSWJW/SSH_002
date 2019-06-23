package 原型模式.imp;

import 原型模式.abstrackVo.Shape;

/**
 * Created by WJW on 2019/6/23.
 */
public class Rectangle extends Shape {
    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
