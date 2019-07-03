package _02_抽象工厂模式;

import _02_抽象工厂模式.factory.AbstractFactory;
import _02_抽象工厂模式.vo.Color;
import _02_抽象工厂模式.vo.Shape;

public class DemoTest {
	public static void main(String[] args) {
		AbstractFactory shapeFactory = FactoryProducer.getFactory("Shape");
		Shape shape = shapeFactory.getShape("CIRCLE");
		shape.draw();
		
		Shape shape2 = shapeFactory.getShape("Rectangle");
		shape2.draw();
		
		AbstractFactory  colorFactory = FactoryProducer.getFactory("color");
		Color color = colorFactory.getColor("red");
		color.fill();
	}
}
