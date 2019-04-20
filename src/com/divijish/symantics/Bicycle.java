package com.divijish.symantics;

public class Bicycle {
	
protected static int count = 23;
	
	private final Bicycle self = this;
	
	private String name;
	
	Bicycle(String name){
		self.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
