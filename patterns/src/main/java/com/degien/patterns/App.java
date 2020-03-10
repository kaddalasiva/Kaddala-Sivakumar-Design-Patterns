package com.degien.patterns;


import com.degien.AdapterPattern.DriverAdapter;
import com.degien.BridgePattern.DriverBridge;
import com.degien.CommandPattern.DriverCommand;
import com.degien.PrototypePattern.DriverPrototype;
import com.degien.SingletonPattern.DriverSingleton;
import com.degien.TemplatePattern.TemplatePatternDemo;


public class App 
{
    @SuppressWarnings("unused")
	public static void main( String[] args )
    {
		TemplatePatternDemo t = new TemplatePatternDemo();
		DriverSingleton s = new DriverSingleton();
		DriverAdapter a = new DriverAdapter();
		DriverCommand c = new DriverCommand();
		DriverBridge b = new DriverBridge();
		DriverPrototype p = new DriverPrototype();
    }
}
