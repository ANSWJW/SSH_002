package _10_装饰器模式.imp;

import _10_装饰器模式.api.Shape;

/**
 * Created by WJW on 2019/6/27.
 */
public abstract class ShapeDecorator implements Shape {

    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
