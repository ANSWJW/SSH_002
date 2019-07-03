package _02_抽象工厂模式.shapeImp;

import _02_抽象工厂模式.vo.Shape;

public class Circle implements Shape{

	@Override
	public void draw() {
		  System.out.println("Inside Circle::draw() method.");
	}
}
