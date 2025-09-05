package com.learn.app.design.abstractfactory;

sealed public interface CheckBox permits WindowsCheckbox,MacCheckbox {
	
	void render();


}
