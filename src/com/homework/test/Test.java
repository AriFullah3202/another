package com.homework.test;



import java.util.List;

import com.homework.api.Student;

import com.homework.dao.StudentDaoImp;

public class Test {

	public static void main(String[] args) {
		
		/*
		 * Student student1 = new Student(); student1.setRoolNo(002);
		 * student1.setName("afif"); student1.setAddress("lohagara");
		 */
		
        
        StudentDaoImp studentdao = new StudentDaoImp();
        //studentdao.insert(student1);
        List<Student> student = studentdao.findallStudent();
        studentdao.printAllStudent(student);
	}

}
