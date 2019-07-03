package _12_享元模式;

import _12_享元模式.api.Shape;
import _12_享元模式.imp.Circle;

import java.util.HashMap;

/**
 * Created by WJW on 2019/6/30.
 */
public class ShapeFactory {
    private static final HashMap<String ,Shape> circleMap = new HashMap<String, Shape>();

    public static Shape getCircle(String color){
        Circle circle = (Circle)circleMap.get(color);
        if (circle == null){
            circle = new Circle(color);
            circleMap.put(color,circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
