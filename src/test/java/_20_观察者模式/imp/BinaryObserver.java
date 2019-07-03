package _20_观察者模式.imp;

import _20_观察者模式.Subject;
import _20_观察者模式.api.Observer;

public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Binary String: "  + Integer.toBinaryString( subject.getState() ) );
    }
}
