package com.learn.app.design.abstractfactory;

public class AbstractFactoryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * UIFactory wF = new WindowsFactory(); Button winButton = wF.createButton();
		 * winButton.render(); CheckBox winCheckbox = wF.createCheckbox();
		 * winCheckbox.render(); UIFactory mF = new MacFactory(); Button macButton =
		 * mF.createButton(); macButton.render(); CheckBox macCheckbox =
		 * mF.createCheckbox(); macCheckbox.render();
		 */
		
		//Java-21 sealed, final classes and enhanced switch expressions
		String os = args.length > 0 ? args[0] : "Windows";

		UIFactory factory = switch(os) {
			
			case "Windows"->new WindowsFactory();
			case "Mac" -> new MacFactory();
			default -> throw new IllegalArgumentException("Unsupported OS"+os);
			
		
		};
		
		AbstractFactoryApplication app = new AbstractFactoryApplication(factory);
		app.render();
		

	}

}
