package _02_抽象工厂模式.factory;

import _02_抽象工厂模式.vo.Color;
import _02_抽象工厂模式.vo.Shape;

public abstract class AbstractFactory {
	public abstract Color getColor(String color);
	
	public abstract Shape getShape(String shape);
}
