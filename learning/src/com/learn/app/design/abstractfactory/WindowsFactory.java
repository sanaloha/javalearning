package com.learn.app.design.abstractfactory;

public class WindowsFactory implements UIFactory{

	@Override
	public Button createButton() {
		// TODO Auto-generated method stub
	
		return new WindowsButton();
	}

	@Override
	public CheckBox createCheckbox() {
		// TODO Auto-generated method stub
		
		return new WindowsCheckbox();
	}

}
