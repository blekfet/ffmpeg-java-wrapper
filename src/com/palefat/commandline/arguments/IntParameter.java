package com.palefat.commandline.arguments;

public class IntParameter extends Parameter {

	
	private int value;
	
	public void setValue(int value){
		this.value=value;
	}
	
	@Override
	public String toString(){
		return this.flag + " " + value;
	}
	
}