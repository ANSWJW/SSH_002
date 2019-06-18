package 抽象工厂模式;

import 抽象工厂模式.factory.AbstractFactory;
import 抽象工厂模式.factory.ColorFactory;
import 抽象工厂模式.factory.ShapeFactory;

public class FactoryProducer {
	public static AbstractFactory getFactory(String choice) {
		if (choice.equalsIgnoreCase("SHAPE")) {
			return new ShapeFactory();
		}else if (choice.equalsIgnoreCase("COLOR")) {
			return new ColorFactory();
		}
		return null;
	}
}
