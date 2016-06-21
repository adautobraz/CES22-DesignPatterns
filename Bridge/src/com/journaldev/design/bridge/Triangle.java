package com.journaldev.design.bridge;

public class Triangle extends Shape{
	
	public Triangle (Color c){
		super(c);
	}

	@Override
	public void applyColor(){
		System.out.println("Triângulo colorido com ");
		color.applyColor();
	}
}
