package org.studinfo;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("get the student id:"+id);
	}
	public void getStudentInfo(int id,String name) {
		System.out.println("get the student id and name:"+id+","+name);
	}
	public void getStudentInfo(String email,String phoneNumber) {
		System.out.println("get the student name and phonenumber:"+email+","+phoneNumber);
	}
	public static void main(String[] args) {
		Students information=new Students();
		information.getStudentInfo(101);
		information.getStudentInfo(101,"Kavi");
		information.getStudentInfo("kavi@gmail.com","9123456780");	
	}

}
