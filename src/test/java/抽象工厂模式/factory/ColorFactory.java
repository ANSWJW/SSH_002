package 抽象工厂模式.factory;

import 抽象工厂模式.colorImp.Blue;
import 抽象工厂模式.colorImp.Green;
import 抽象工厂模式.colorImp.Red;
import 抽象工厂模式.vo.Color;
import 抽象工厂模式.vo.Shape;

public class ColorFactory extends AbstractFactory {

	@Override
	public Color getColor(String color) {
		if (color == null) {
			return null;
		}
		if (color.equalsIgnoreCase("RED")) {
			return new Red();
		} else if (color.equalsIgnoreCase("GREEN")) {
			return new Green();
		} else if (color.equalsIgnoreCase("BLUE")) {
			return new Blue();
		}
		return null;
	}

	@Override
	public Shape getShape(String shape) {
		return null;
	}

}
