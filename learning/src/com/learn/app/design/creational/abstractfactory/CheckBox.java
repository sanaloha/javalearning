package com.learn.app.design.creational.abstractfactory;

sealed public interface CheckBox permits WindowsCheckbox,MacCheckbox {
	
	void render();


}
