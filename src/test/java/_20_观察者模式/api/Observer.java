package _20_观察者模式.api;

import _20_观察者模式.Subject;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
