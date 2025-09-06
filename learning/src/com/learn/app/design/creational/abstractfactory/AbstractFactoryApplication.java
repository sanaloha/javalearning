package com.learn.app.design.creational.abstractfactory;

public class AbstractFactoryApplication {
	private Button button;
	private CheckBox checkbox;
		
	AbstractFactoryApplication(UIFactory factory){
		this.button = factory.createButton();
		this.checkbox = factory.createCheckbox();
		
	}
	
	public void render() {
		button.render();
		checkbox.render();
	}
	
	
}
