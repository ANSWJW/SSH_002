package _02_抽象工厂模式.colorImp;

import _02_抽象工厂模式.vo.Color;

public class Green implements Color{

	@Override
	public void fill() {
		System.out.println("Inside Green::fill() method.");
	}

}
