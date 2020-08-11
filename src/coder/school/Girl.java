package coder.school;

public class Girl extends Student{//Inheritance
	String skirt_color;
	
	public void getParent() {//Override method
		this.name = "八路さん";
		System.out.println("I am a brave girl");
	}
}
