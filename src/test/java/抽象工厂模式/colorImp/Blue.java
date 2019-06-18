package 抽象工厂模式.colorImp;

import 抽象工厂模式.vo.Color;

public class Blue implements Color{

	@Override
	public void fill() {
		System.out.println("Inside Blue::fill() method.");
	}

}
