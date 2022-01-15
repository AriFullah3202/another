package com.homework.service;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.homework.api.Student;

public class StudentRowmaper implements RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet res, int noRow) throws SQLException {
		Student student = new Student();
		
		student.setRoolNo(res.getInt("ROOL_NO"));
		student.setName(res.getString("STUDENT_NAME"));
		student.setAddress(res.getString("STUDENT_ADDRESS"));
		return student;
	}

}
