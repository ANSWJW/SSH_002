package _25_访问者模式.api;

import _25_访问者模式.imp.Computer;
import _25_访问者模式.imp.Keyboard;
import _25_访问者模式.imp.Monitor;
import _25_访问者模式.imp.Mouse;

public interface ComputerPartVisitor {
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}
