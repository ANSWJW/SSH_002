package _25_访问者模式;

import _25_访问者模式.imp.Computer;
import _25_访问者模式.imp.ComputerPartDisplayVisitor;

public class VisitorPatternDemo {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
