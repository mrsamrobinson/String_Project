package three.controller;

import three.view.StringView;



public class StringController
{
	
	private StringView myView;
	
	public StringController()
	{
		myView = new StringView();
		
	}
	
	/**
	 * Starts the code starting with the displayRuntimeError method.
	 */
	
	public void start()
	{
		//myView.displayRuntimeError();
		String temp = myView.sendParameterMethod();
		myView.usePassedValue(temp);
		
		myView.usePassedValue(myView.sendParameterMethod());
		
		myView.moreInteractive("Sam", temp);
		
		
		myView.testStringMethods();
	}
	
	
}
