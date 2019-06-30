package 享元模式;

import 享元模式.imp.Circle;

/**
 * Created by WJW on 2019/6/30.
 */
public class FlyweightPatternDemo {

    private static final String colors[] =  { "Red", "Green", "Blue", "White", "Black" };
    public static void main(String[] args) {
        for (int i = 0 ;i<20;i++){
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    private static String getRandomColor() {
        int i = (int) (Math.random() * colors.length);
        return colors[i];
    }
    private static int getRandomX() {
        return (int)(Math.random()*100 );
    }
    private static int getRandomY() {
        return (int)(Math.random()*100);
    }
}
