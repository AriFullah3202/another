package com.homework.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.homework.api.Student;
import com.homework.service.StudentRowmaper;

public class StudentDaoImp implements StudentDAO {
    private JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());
	
	/*
	 * @Override
	 * public void insert(Student student) { String sql =
	 * "INSERT INTO STUDENT VALUES(?,?,?)"; Object arg[] =
	 * {student.gt.getName(),student.getAddress()}; int
	 * noOfRowInserted = jdbcTemplate.update(sql , arg);
	 * 
	 * System.out.println("no of row inserted   " +noOfRowInserted); }
	 */
	public DataSource getDataSource() {
		String url ="jdbc:mysql://127.0.0.1:3306/School";
		String username ="root";
		String password ="arif12345678arif";
		
		
		
		DataSource datasource = new DriverManagerDataSource(url, username, password);
		return datasource;
		
	}
	@Override
	public List<Student> findallStudent() {
		String sql = "SELECT * FROM STUDENT";
		List<Student> studentlist = jdbcTemplate.query(sql, new StudentRowmaper());
		
		return studentlist;
	}
	public void printAllStudent(List<Student> student) {
		for(Student studentlist: student) {
			System.out.println(studentlist);
		}
	}
	
	

}
