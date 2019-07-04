package _21_状态模式.imp;

import _21_状态模式.Context;
import _21_状态模式.api.State;

public class StopState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    public String toString(){
        return "Stop State";
    }
}
