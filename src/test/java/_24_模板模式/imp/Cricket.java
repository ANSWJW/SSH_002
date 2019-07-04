package _24_模板模式.imp;

import _24_模板模式.api.Game;

public class Cricket extends Game {
    public void endPlay() {
        System.out.println("Cricket Game Finished!");
    }

    public void initialize() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    public void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }
}
