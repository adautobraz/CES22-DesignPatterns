package com.journaldev.design.bridge;

public class Pentagon extends Shape{
	
	public Pentagon (Color c) {
		super(c);
	}
	
	@Override
	public void applyColor(){
		System.out.println("Pentágono colorido com");
		color.applyColor();
	}

}
