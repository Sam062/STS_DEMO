package com.factoryDesignPattern;

import java.util.Scanner;

public class TestFactory {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Input TR/SQ/CI :-");
		String s=sc.next();
		sc.close();
		Shape shp=ShapeFactory.generate(s);
		if(shp!=null)
			shp.info();
		else
			System.out.println("No objct found");
	}

}
