package _05_原型模式.imp;

import _05_原型模式.abstrackVo.Shape;

/**
 * Created by WJW on 2019/6/23.
 */
public class Square extends Shape{
    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
