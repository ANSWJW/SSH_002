package _25_访问者模式.api;

public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
