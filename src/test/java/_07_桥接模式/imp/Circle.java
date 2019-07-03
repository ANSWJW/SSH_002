package _07_桥接模式.imp;

import _07_桥接模式.api.DrawAPI;
import _07_桥接模式.api.Shape;

/**
 * Created by WJW on 2019/6/26.
 */
public class Circle extends Shape {

    private int x,y,radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCirle(radius,x,y);
    }
}
