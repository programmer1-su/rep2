package coder.test;
import coder.model.Student;
import coder.model.Users;

public class Main {

	public static void main(String[] args) {
		Test t = new Test();//same package with main and test level
		Student[] student = new Student[5];//not same package name level must import
		Users user1 = new Users("田口さん", "Alphabert", 20, 4.5);
		Users user2 = new Users("井出さん", "Land Crusier", 30, 5.5);
		Users user3 = new Users("ラジュさん", "Parjaro", 40, 4.8);
		Users user4 = new Users("大沢さん", "Land Crusier", 45, 4.9);
		Users user5 = new Users("新山さん", "Swift",  35, 4.9);
		
		Student stu1 = new Student("川崎",10001,user1);
		Student stu2 = new Student("渋谷", 10002,user2);
		Student stu3 = new Student("埼玉",10003,user3);
		Student stu4 = new Student("東京", 10004,user4);
		Student stu5 = new Student("新宿",10005,user5);
		
		student[0] = stu1;
		student[1] = stu2;
		student[2] = stu3;
		student[3] = stu4;
		student[4] = stu5;
		
		for(int i = 0;i < student.length;i ++) {
			System.out.println(student[i].getUser().getName() + 
					"\t | \t" + student[i].getStudentId() + 
					"\t | \t" +  student[i].getCity() + 
					"\t | \t" + student[i].getUser().getCar());
		}
	}

}

