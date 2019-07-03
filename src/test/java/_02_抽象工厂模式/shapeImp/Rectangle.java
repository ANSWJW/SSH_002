package _02_抽象工厂模式.shapeImp;

import _02_抽象工厂模式.vo.Shape;

public class Rectangle implements Shape{

	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}
}
