package coder.model;

public class Student {
	private String city;
	private int StudentId;
	private Users user;
	
	
	public Student(String city, int studentId, Users user) {
		this.city = city;
		this.StudentId = studentId;
		this.user = user;
	}

	public String getCity() {
		return city;
	}
	
	public int getStudentId() {
		return StudentId;
	}
	
	public Users getUser() {
		return user;
	}

	
	
	
}
