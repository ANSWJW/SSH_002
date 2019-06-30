package 外观模式;

import 外观模式.api.Shape;
import 外观模式.imp.Circle;
import 外观模式.imp.Rectangle;
import 外观模式.imp.Square;

/**
 * Created by WJW on 2019/6/30.
 */
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }
    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }

}
