package 桥接模式.imp;

import 桥接模式.api.DrawAPI;

/**
 * Created by WJW on 2019/6/26.
 */
public class RedCircle implements DrawAPI {
    @Override
    public void drawCirle(int radius,int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
