package _10_装饰器模式;

import _10_装饰器模式.api.Shape;
import _10_装饰器模式.imp.Circle;
import _10_装饰器模式.imp.Rectangle;
import _10_装饰器模式.imp.RedShapeDecorator;
import _10_装饰器模式.imp.ShapeDecorator;

/**
 * Created by WJW on 2019/6/27.
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        ShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();

    }
}
