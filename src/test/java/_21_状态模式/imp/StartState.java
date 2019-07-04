package _21_状态模式.imp;

import _21_状态模式.Context;
import _21_状态模式.api.State;

public class StartState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }
    public String toString(){
        return "Start State";
    }
}
