package com.learn.app.design.abstractfactory;

sealed public interface Button permits WindowsButton, MacButton{
	
	void render();

}
