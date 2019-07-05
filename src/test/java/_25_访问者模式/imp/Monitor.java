package _25_访问者模式.imp;

import _25_访问者模式.api.ComputerPart;
import _25_访问者模式.api.ComputerPartVisitor;

public class Monitor implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
