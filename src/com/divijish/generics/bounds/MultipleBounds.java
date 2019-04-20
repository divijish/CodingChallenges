/**
 * 
 */
package com.divijish.generics.bounds;

/**
 * @author divij
 * 
 * @param after extends keyword, this first type should be a class(if any) and
 *              then interfaces, otherwise will give compiletime error.
 *
 */
public class MultipleBounds<T extends BoundClassA & BoundInterfaceB & BoundInterfaceC> {

	private T t;

	public MultipleBounds(T t) {
		super();
		this.t = t;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		//This type should implement and extend all the class and interfaces mentioned in class parameter.
	
		ChildBoundClass cbc = new ChildBoundClass();

		cbc.setChildName("child");

		MultipleBounds<ChildBoundClass> bound = new MultipleBounds<>(cbc);

//		MultipleBounds<Integer> intBound = new MultipleBounds<>(1);//This give compile time error.
	}

}
