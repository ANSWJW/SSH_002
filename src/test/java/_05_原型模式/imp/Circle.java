package _05_原型模式.imp;

import _05_原型模式.abstrackVo.Shape;

/**
 * Created by WJW on 2019/6/23.
 */
public class Circle extends Shape{
    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
