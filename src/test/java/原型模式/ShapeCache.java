package 原型模式;


import 原型模式.abstrackVo.Shape;
import 原型模式.imp.Circle;
import 原型模式.imp.Rectangle;
import 原型模式.imp.Square;

import java.util.Hashtable;

/**
 * Created by WJW on 2019/6/23.
 */
public class ShapeCache {
    private static Hashtable<String ,Shape> shapeMap = new Hashtable<String, Shape>();

    public static Shape getShape(String shapeId){
        Shape shape = shapeMap.get(shapeId);
        return (Shape) shape.clone();
    }

    // 对每种形状都运行数据库查询，并创建该形状
    // shapeMap.put(shapeKey, shape);
    // 例如，我们要添加三种形状
   public static void loadCache(){
       Circle circle = new Circle();
       circle.setId("1");
       shapeMap.put(circle.getId(),circle);

       Square square = new Square();
       square.setId("2");
       shapeMap.put(square.getId(),square);

       Rectangle rectangle = new Rectangle();
       rectangle.setId("3");
       shapeMap.put(rectangle.getId(),rectangle);
   }


}
