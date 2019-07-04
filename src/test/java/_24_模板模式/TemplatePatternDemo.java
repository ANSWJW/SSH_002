package _24_模板模式;

import _24_模板模式.api.Game;
import _24_模板模式.imp.Cricket;
import _24_模板模式.imp.Football;

public class TemplatePatternDemo {
    public static void main(String[] args) {
        Game game  = new Cricket();
        game.play();
        System.out.println();
        game  = new Football();
        game.play();
    }
}
