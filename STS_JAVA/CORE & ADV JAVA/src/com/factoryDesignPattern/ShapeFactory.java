package com.factoryDesignPattern;

public class ShapeFactory{
	public static Shape generate(String s) {
		Shape x=null;
		if(s.equals("TR")) {
			x=new Triangle();			
		}
		else if(s.equals("SQ")) {
			x=new Squire();
		}
		else if(s.equals("CI")) {
			x=new Circle();
		}
		return x;
	}
	

}
