package com.java.coding.accolite;

public class Charlie implements Alpha, Beta {
	/*
	 * 1.The super.display() statement inside the main method is not allowed 
	 * because the main method is static, and you cannot use super in a static context.
	 * 
	 * 2. The display method is ambiguous because both interfaces Alpha and Beta provide 
	 * a default implementation of the display method. In a class that implements multiple 
	 * interfaces with conflicting default methods.
	 */
	public static void main(String args[]) {
		Charlie obj = new Charlie();
		super.display();
	}
}
