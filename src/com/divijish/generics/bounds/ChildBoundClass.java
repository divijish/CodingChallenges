package com.divijish.generics.bounds;

public class ChildBoundClass extends BoundClassA implements BoundInterfaceB, BoundInterfaceC {

	private String childName;

	public String getChildName() {
		return childName;
	}

	public void setChildName(String childName) {
		this.childName = childName;
	}
	
	
	
}
