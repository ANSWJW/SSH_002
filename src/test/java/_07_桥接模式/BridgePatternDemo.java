package _07_桥接模式;

import _07_桥接模式.api.Shape;
import _07_桥接模式.imp.Circle;
import _07_桥接模式.imp.GreenCircle;
import _07_桥接模式.imp.RedCircle;

/**
 * Created by WJW on 2019/6/26.
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100,10,new RedCircle());
        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
