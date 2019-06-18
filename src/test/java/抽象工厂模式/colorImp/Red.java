package 抽象工厂模式.colorImp;

import 抽象工厂模式.vo.Color;

public class Red implements Color{

	@Override
	public void fill() {
		 System.out.println("Inside Red::fill() method.");
	}

}
