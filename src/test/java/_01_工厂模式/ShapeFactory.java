package _01_工厂模式;

import _01_工厂模式.api.Shape;
import _01_工厂模式.imp.Circle;
import _01_工厂模式.imp.Rectangle;
import _01_工厂模式.imp.Square;

public class ShapeFactory {
    //使用getShape方法获取形状类型的对象
    public Shape getShape(String shapeType){
        if (shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            System.out.print("");
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
