package _01_工厂模式.imp;

import _01_工厂模式.api.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
