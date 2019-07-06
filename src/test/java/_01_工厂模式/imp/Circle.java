package _01_工厂模式.imp;

import _01_工厂模式.api.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
