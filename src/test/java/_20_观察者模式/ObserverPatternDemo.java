package _20_观察者模式;

import _20_观察者模式.imp.BinaryObserver;
import _20_观察者模式.imp.HexaObserver;
import _20_观察者模式.imp.OctalObserver;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();
        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
