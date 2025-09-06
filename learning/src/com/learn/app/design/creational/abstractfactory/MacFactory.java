package com.learn.app.design.creational.abstractfactory;

public class MacFactory implements UIFactory{

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
		
		return new MacButton();
	}

	@Override
	public CheckBox createCheckbox() {
		// TODO Auto-generated method stub
		
		return new MacCheckbox();
	}

}
