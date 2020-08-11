package coder.school;

public class Boy extends Student{//Inheritance
	String trouser_color;
	
	public void getParent() {
		System.out.println("Override Method!");
	}
	
	public void myOwnMethod() {
		System.out.println("Own Method!");
	}
}
