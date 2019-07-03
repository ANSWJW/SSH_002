package _02_抽象工厂模式.factory;

import _02_抽象工厂模式.shapeImp.Circle;
import _02_抽象工厂模式.shapeImp.Rectangle;
import _02_抽象工厂模式.shapeImp.Square;
import _02_抽象工厂模式.vo.Color;
import _02_抽象工厂模式.vo.Shape;

public class ShapeFactory extends AbstractFactory {

	@Override
	public Color getColor(String color) {
		return null;
	}

	@Override
	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		} else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		return null;
	}

}
