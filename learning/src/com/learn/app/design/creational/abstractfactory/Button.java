package com.learn.app.design.creational.abstractfactory;

sealed public interface Button permits WindowsButton, MacButton{
	
	void render();

}
